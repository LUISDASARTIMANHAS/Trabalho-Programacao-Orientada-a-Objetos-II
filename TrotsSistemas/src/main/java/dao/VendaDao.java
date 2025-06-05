/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import domain.Venda;
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
public class VendaDao extends GenericDao {
    
    public void inserirVenda(Venda venda) throws HibernateException, ClassNotFoundException {
        inserir(venda);
    }
    

    public List<Venda> listar() throws HibernateException, ClassNotFoundException {       
        return listar(Venda.class);
    }
    
    public List<Venda> pesquisarVenda(String pesq, int tipo) throws HibernateException, ClassNotFoundException {
        
        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Venda.class);
            Root tabela = consulta.from( Venda.class );            
            
            //Restrições
            Predicate restricoes = null;
            switch (tipo) {
                case 1: restricoes = builder.like(tabela.get("nome") , pesq + '%' ); break;
                case 2: restricoes = builder.like(tabela.get("valorTotal") , pesq ); break;
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

    public List<Venda> pesquisarPorNome(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisarVenda(pesq, 1);
    }

    public List<Venda> pesquisarPorCPF(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisarVenda(pesq, 2);
    }

    public List<Venda> pesquisarPorBairro(String pesq) throws HibernateException, ClassNotFoundException {
        return pesquisarVenda(pesq, 3);
    }

}
