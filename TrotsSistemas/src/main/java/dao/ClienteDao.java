/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.sql.HibernateException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ClienteDao {

    public List<Cliente> listar() throws HibernateException, ClassNotFoundException {
        List<Cliente> lista = new ArrayList();
        return lista;
    }

    public void Inserir(Cliente cli) throws HibernateException, ClassNotFoundException {
        
    }

    public void Excluir(Cliente cli) throws HibernateException, ClassNotFoundException {
        
    }
}
