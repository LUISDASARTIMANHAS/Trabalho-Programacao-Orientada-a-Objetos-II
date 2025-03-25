/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import control.DaoManager;
import domain.Cidade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class CidadeDao {

    public List<Cidade> listar() throws SQLException, ClassNotFoundException {
        List<Cidade> lista = new ArrayList();
        Statement stat = ConexaoPSQL.getConexao().createStatement();

        String pesq = "SELECT * FROM Cidade";

        ResultSet res = stat.executeQuery(pesq);

        while (res.next()) {
            Cidade cidade = new Cidade(
                    res.getInt("id_cidade"),
                    res.getString("nome")
            );
            lista.add(cidade);
        }
        return lista;
    }
}
