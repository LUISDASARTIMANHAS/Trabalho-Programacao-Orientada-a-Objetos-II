/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.CidadeDao;
import dao.ClienteDao;
import dao.ConexaoHibernate;
import domain.Cidade;
import domain.Cliente;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
//gerenciador de dominio
public class DaoManager {

    private CidadeDao cidadeDao;
    private ClienteDao clienteDao;
//    private Pedido pedido;

    public DaoManager() throws ClassNotFoundException, HibernateException{
        ConexaoHibernate.getSessionFactory();

//        instanciar as classes DAO 
        cidadeDao = new CidadeDao();
        clienteDao = new ClienteDao();
    }

    public List<Cidade> listarCidades() throws HibernateException, ClassNotFoundException {
        return cidadeDao.listar();
    }

}
