/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoMysql;
import java.sql.SQLException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public  class DaoManager {

    public DaoManager() throws ClassNotFoundException, SQLException {
        ConexaoMysql.getConexao();
    }
    
}
