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

    public DaoManager() throws java.lang.ExceptionInInitializerError, ClassNotFoundException, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();

//        instanciar as classes DAO 
        genericDao = new GenericDao();
        clienteDao = new ClienteDao();
    }
    
    // ######  MÉTODOS GENÉRICOS   ####
    
    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        return genericDao.listar(classe);      
    }
    
    public void excluir(Object obj) throws HibernateException {
        genericDao.excluir(obj);
    }
    
    // ##############

}
