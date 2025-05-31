/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDao;
import dao.ConexaoHibernate;
import dao.ErvaDao;
import dao.GenericDao;
import domain.Cliente;
import domain.Endereco;
import domain.Erva;
import domain.ItemPedido;
import domain.Venda;
import java.util.List;
import javax.swing.Icon;
import org.hibernate.HibernateException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
//gerenciador de dominio
public class DaoManager {

    private GenericDao genericDao;
    private ClienteDao clienteDao;
    private ErvaDao ervaDao;

    public DaoManager() throws java.lang.ExceptionInInitializerError, ClassNotFoundException, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();

//        instanciar as classes DAO 
        genericDao = new GenericDao();
        clienteDao = new ClienteDao();
        ervaDao = new ErvaDao();
    }

    // ######  MÉTODOS GENÉRICOS   ####
    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        return genericDao.listar(classe);
    }
    
    public Cliente InserirCliente(String nome,String cpf,String email,String tel,Icon Foto, Endereco endereco) throws HibernateException, ClassNotFoundException {
//        String nome, String cpf, String email, String tel, Endereco endereco
        Cliente cli = new Cliente(nome, cpf, email, tel,Foto, endereco);
            
            clienteDao.inserir(cli);
            return cli;
    }

    public Erva InserirErva(String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao) throws HibernateException, ClassNotFoundException {
//        String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao
        Erva erva = new Erva(nome, sabor, peso, valor, qtdeEstoque, descricao);
                
            ervaDao.inserir(erva);
            return erva;
    }

    
    public void excluir(Object obj) throws HibernateException {
        genericDao.excluir(obj);
    }

    // ##############
    public List<Cliente> pesquisarCliente(String pesq, int tipo) throws HibernateException, ClassNotFoundException, ClassNotFoundException {

        switch (tipo) {
            case 1:
                return clienteDao.pesquisarPorNome(pesq);
            case 2:
                return clienteDao.pesquisarPorCPF(pesq);
            case 3:
                return clienteDao.pesquisarPorBairro(pesq);
            case 4:
                return clienteDao.pesquisarPorMes(pesq);
            default:
                return null;
        }
    }
    
    public Venda inserirVenda(Cliente cliente, List<ItemPedido> listaItensPedido) {
        
        Venda venda = new Venda(cliente, (float) 0.0, listaItensPedido);

        float total = (float) 0.0;
        
        // ATUALIZAR A REFERENCIA DO PEDIDO DENTRO DA LISTA DE ITENS
        for (ItemPedido itemPedido : listaItensPedido) {
            itemPedido.setVenda(venda);
            total = total + itemPedido.getQdte()* itemPedido.getErva().getValor();
        }
        venda.setValorTotal(total);
        
        genericDao.inserir(venda);
        return venda;
    }
    
}
