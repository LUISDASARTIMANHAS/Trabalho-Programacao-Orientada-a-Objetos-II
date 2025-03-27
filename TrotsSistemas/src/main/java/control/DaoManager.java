/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.CidadeDao;
import dao.ConexaoMysql;
import dao.ConexaoPSQL;
import domain.Cidade;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
//gerenciador de dominio
public class DaoManager {
    private CidadeDao cidadeDao;
//    private Pedido pedido;

    public DaoManager() throws ClassNotFoundException, SQLException {
//        ConexaoPSQL.getConexao();
        
//        instanciar as classes DAO
        cidadeDao = new CidadeDao();
    }

//    public List<Cidade> listarCidades() throws SQLException, ClassNotFoundException {
//        return cidadeDao.listar();
//    }
}
