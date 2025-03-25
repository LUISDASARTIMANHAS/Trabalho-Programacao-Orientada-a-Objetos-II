/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ConexaoPSQL {

    private static Connection conexao;

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgres://localhost:5432/trotsSistemas";
        String user = "trotsSistemas";
        String password = "trotsSistemas";
        
        Class.forName("org.postgresql.Driver");
        
        conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}
