/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDao;
import dao.ConexaoHibernate;
import dao.GenericDao;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
//gerenciador de dominio
public class DaoManager {

    private GenericDao genericDao;
    private ClienteDao clienteDao;
//    private Pedido pedido;

    public DaoManager() throws ClassNotFoundException, HibernateException {
        ConexaoHibernate.getSessionFactory();

//        instanciar as classes DAO 
        genericDao = new GenericDao();
        clienteDao = new ClienteDao();
    }

    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        return genericDao.listar(classe);
    }
    
    public void inserir(Class classe) throws HibernateException, ClassNotFoundException {
        genericDao.Inserir(classe);
    }
    
    public void deletar(Class classe) throws HibernateException, ClassNotFoundException {
        genericDao.Excluir(classe);
    }

}
