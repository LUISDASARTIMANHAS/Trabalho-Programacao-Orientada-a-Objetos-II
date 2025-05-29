/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import control.DaoManager;
import control.GUIManager;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class GenericDao {

    public void inserir(Object obj) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.save(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

    }

    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //operação
//            cria um construtor de sql
            CriteriaQuery query = sessao.getCriteriaBuilder().createQuery(classe);

//            modifica a query
            query.from(classe);

            //ececuta o sql
            lista = sessao.createQuery(query).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);

        }
//        commit

        return lista;
    }

    public void alterar(Object obj) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.update(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

    }

    public void excluir(Object obj) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.delete(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

    }
}
