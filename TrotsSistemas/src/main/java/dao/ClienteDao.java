/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ClienteDao extends GenericDao {
    
//    inserir esta aqui para obrigar o programador a passar cliente e não qualquer coisa
    public void inserirCliente(Cliente cli) throws HibernateException, ClassNotFoundException {
        inserir(cli);
    }
    
    public void alterarCliente(Cliente cli) throws HibernateException, ClassNotFoundException {
        alterar(cli);
    }
    

    public List<Cliente> listar() throws HibernateException, ClassNotFoundException {       
        return listar(Cliente.class);
    }
    
    public List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException, ClassNotFoundException {
        
        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Cliente.class);
            Root tabela = consulta.from( Cliente.class );            
            
            //Restrições
            Predicate restricoes = null;
            switch (tipo) {
                case 1: restricoes = builder.like(tabela.get("nome") , pesq + '%' ); break;
                case 2: restricoes = builder.like(tabela.get("cpf") , pesq ); break;
                case 3: restricoes = builder.like(tabela.get("endereco").get("bairro") , pesq + '%' ); break;
                case 4: 
                        Expression mes = builder.function("month", Integer.class , tabela.get("dtNasc") );
                        restricoes = builder.equal(mes, pesq);
                        break;                
            }
                       
            consulta.where(restricoes);
            
            // Executar a query
            lista = sessao.createQuery(consulta).getResultList();            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
                      
        return lista;
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
    
    public List contPorBairro() {
        List lista = null;
        Session sessao = null;
        
         try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );            
            Root tabela = consulta.from( Cliente.class );            
            
            consulta.multiselect( tabela.get("endereco").get("bairro") ,
                                  builder.count(tabela.get("idCliente") ) );
            
            consulta.groupBy(tabela.get("endereco").get("bairro") );
            consulta.orderBy( builder.asc( tabela.get("endereco").get("bairro") )  );
            
            // Executar a query
            lista = sessao.createQuery(consulta).getResultList();            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        
        return lista;        
    }

}
