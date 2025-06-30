/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.ItemPedido;
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
     public void inserirVenda(Venda venda) throws HibernateException {
         inserir(venda);
     }
    
    public void carregarItens(Venda venda) throws HibernateException {
        Session sessao = null;  
        
        try {
                               
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Verifica se a lista JÁ FOI CARREGADA
            if ( !Hibernate.isInitialized( venda.getListaItensPedido() ) ) {
          
                //System.out.println("Carregar Pedido " + venda.getIdPedido() );
                
                // Carrega o PROXY para outro objeto
                Venda pedTemp = sessao.get(Venda.class, venda.getIdVenda());
                
                // Carrega a lista de PEDIDOS
                Hibernate.initialize(pedTemp.getListaItensPedido());

                // Cuidado: sobrescrevendo uma referência de outra sessão
                // Atualiza a lista no OBJETO principal (parâmetro)
                venda.setListaItensPedido(pedTemp.getListaItensPedido());                

            } 
            
            
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }

    }
    
    private List<Venda> pesquisar(int tipo, String pesq) throws HibernateException {
                
       List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Venda.class);
            
            Root tabela = consulta.from(Venda.class);
            
            // Alterar o fetch LAZY
            //tabela.fetch("itensPedido", JoinType.INNER );
            //consulta.distinct(true);
            
            Predicate restricoes = null;
            switch ( tipo ) {
                case 0: restricoes = builder.equal(tabela.get("idPedido"), pesq);
                        break;      
                case 1: restricoes = builder.like(tabela.get("cliente").get("nome"), pesq+"%");
                        break;      
                                        
                case 2: restricoes = builder.like(tabela.get("cliente").get("endereco").get("bairro"), pesq+"%");
                        break;                    
                    
                case 3: Expression mes = builder.function("month", Integer.class, tabela.get("dtPedido") );
                        Expression ano = builder.function("year", Integer.class, tabela.get("dtPedido") );
                        
                        String arr[] = pesq.split("/");                        
                        
                        restricoes = builder.and(  
                                builder.equal(mes, arr[0]),
                                builder.equal(ano, arr[1])
                        );
                        break;
            }

            consulta.where(restricoes);
            // EXECUTAR
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
                                        
    }
    
    
    public List<Venda> pesquisarPorID(String pesq) {
         return pesquisar(0,pesq);             
    }
    
    public List<Venda> pesquisarPorCliente(String pesq) {             
        return pesquisar(1,pesq);
    }
    
    public List<Venda> pesquisarPorBairro(String pesq) {             
        return pesquisar(2,pesq);
    }
        
    public List<Venda> pesquisarPorMes(String pesq) {             
        return pesquisar(3,pesq);
    }

    public List valorPorMes() {
        List lista = null;
        Session sessao = null;
        
         try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );            
            Root tabela = consulta.from( Venda.class );   
            
            Expression mes = builder.function("month", Integer.class, tabela.get("dtPedido") );
            Expression ano = builder.function("year", Integer.class, tabela.get("dtPedido") );
            
            consulta.multiselect( mes , ano, builder.sum(tabela.get("valorTotal") ) );
            
            consulta.groupBy( mes, ano );
            consulta.orderBy( builder.asc( ano ), builder.asc( mes )   );
            
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
    
    public List valorPorCliente() {
        List lista = null;
        Session sessao = null;
        
         try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );            
            Root tabela = consulta.from( Venda.class );            
            
            consulta.multiselect( tabela.get("cliente") ,
                                  builder.sum(tabela.get("valorTotal") ) );
            
            consulta.groupBy( tabela.get("cliente") );
            consulta.orderBy( builder.asc( tabela.get("cliente") )  );
            
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
