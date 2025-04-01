/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import LDAUtils.control.Endereco;
import com.mysql.cj.xdevapi.PreparableStatement;
import domain.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ClienteDao {

    public List<Cliente> listar() throws SQLException, ClassNotFoundException {
        List<Cliente> lista = new ArrayList();
        Statement stat = ConexaoPSQL.getConexao().createStatement();
        String sql = "SELECT * FROM Cliente";

        ResultSet res = stat.executeQuery(sql);

        while (res.next()) {
            Cliente item = new Cliente(
                    res.getInt("id_cliente"),
                    res.getString("nome"),
                    res.getString("cpf"),
                    res.getString("email"),
                    res.getString("tel"),
                    (Endereco) res.getObject("endereco")
            );
            lista.add(item);
        }
        return lista;
    }

    public void Inserir(Cliente cli) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO Cliente (nome, cpf,email,tel) VALUES (?,?,?,?)";
        PreparedStatement stat = ConexaoPSQL.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        int col = 0;

        stat.setString(col++, cli.getNome());
        stat.setString(col++, cli.getCpf());
        stat.setString(col++, cli.getEmail());
        stat.setString(col++, cli.getTel());

        ResultSet res = stat.executeQuery();
        if (res.next()) {
            int id = res.getInt(0);
            cli.setId(id);
        }
    }

    public void Excluir(Cliente cli) throws SQLException, ClassNotFoundException {
        Statement stat = ConexaoPSQL.getConexao().createStatement();
        String sql = "DELETE FROM Cliente WHERE id_cliente = " + cli.getId();

//        verificar se tem pedido precisa ser feito
        stat.execute(sql);
    }
}
