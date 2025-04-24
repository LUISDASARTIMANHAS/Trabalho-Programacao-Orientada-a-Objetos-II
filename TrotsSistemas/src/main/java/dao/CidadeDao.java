/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cidade;
import java.sql.ResultSet;
import java.sql.HibernateException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class CidadeDao {

    public List<Cidade> listar() throws HibernateException, ClassNotFoundException {
        List<Cidade> lista = new ArrayList();
        
        return lista;
    }
}
