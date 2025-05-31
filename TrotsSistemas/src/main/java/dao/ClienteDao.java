/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ClienteDao extends GenericDao {
    
    public void Inserir(Cliente cli) throws HibernateException, ClassNotFoundException {
        Inserir(cli);
    }
    

    public List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException, ClassNotFoundException {

        // TESTE        
        return listar(Cliente.class);

    }

    public List<Cliente> listar() throws HibernateException, ClassNotFoundException {
        return pesquisar("", 0);
    }

    public List<Cliente> pesquisarPorNome(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisar(pesq, 1);
    }

    public List<Cliente> pesquisarPorCPF(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisar(pesq, 2);
    }

    public List<Cliente> pesquisarPorBairro(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisar(pesq, 3);
    }

    public List<Cliente> pesquisarPorMes(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisar(pesq, 4);
    }
}
