/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDao;
import dao.ConexaoHibernate;
import dao.ErvaDao;
import dao.GenericDao;
import dao.VendaDao;
import domain.Cidade;
import domain.Cliente;
import domain.Endereco;
import domain.Erva;
import domain.ItemPedido;
import domain.Venda;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    private VendaDao VendaDao;

    public DaoManager() throws java.lang.ExceptionInInitializerError, ClassNotFoundException, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();

//        instanciar as classes DAO 
        genericDao = new GenericDao();
        clienteDao = new ClienteDao();
        ervaDao = new ErvaDao();
        VendaDao = new VendaDao();
    }

    // ######  MÉTODOS GENÉRICOS   ####
    public List listar(Class classe) throws HibernateException, ClassNotFoundException {
        return genericDao.listar(classe);
    }

    public Cliente InserirCliente(String nome, String cpf, String email, String tel, Icon Foto, Endereco endereco, Cidade cidade) throws HibernateException, ClassNotFoundException {
//        String nome, String cpf, String email, String tel, Endereco endereco
        Cliente cli = new Cliente(nome, cpf, email, tel, Foto, endereco, cidade);

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

    public void carregarItensPedido(Venda venda) {
        VendaDao.carregarItens(venda);
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
            default:
                return null;
        }
    }

    public List<Venda> pesquisarVenda(String pesq, int tipo) throws HibernateException, ClassNotFoundException, ClassNotFoundException {

        switch (tipo) {
            case 1:
                return VendaDao.pesquisarPorID(pesq);
            case 2:
                return VendaDao.pesquisarPorCliente(pesq);
            case 3:
                return VendaDao.pesquisarPorBairro(pesq);
            case 4:
                return VendaDao.pesquisarPorMes(pesq);
            default:
                return null;
        }
    }

    public Venda inserirVenda(Cliente cliente, List<ItemPedido> listaItensPedido) {
        //        String nome, String cpf, String email, String tel, Endereco endereco
        Venda venda = new Venda(cliente, (float) 0.0, listaItensPedido);

        float total = (float) 0.0;

        // ATUALIZAR A REFERENCIA DO PEDIDO DENTRO DA LISTA DE ITENS
        for (ItemPedido itemPedido : listaItensPedido) {
            itemPedido.setVenda(venda);
            total = total + itemPedido.getQdte() * itemPedido.getErva().getValor();
        }
        venda.setValorTotal(total);

        VendaDao.inserirVenda(venda);
        return venda;

    }

    public void relGroupBy(JTable tabela, int tipo) throws Exception {
        List<Object[]> lista = null;

        // Limpa a tabela
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        switch (tipo) {
            case 'B':
                lista = clienteDao.contPorBairro();
                break;
            case 'M':
                lista = VendaDao.valorPorMes();
                break;
            case 'C':
                lista = VendaDao.valorPorCliente();
                break;
        }

        NumberFormat formato = NumberFormat.getCurrencyInstance();

        // Percorrer a LISTA
        if (lista != null) {

            for (Object[] obj : lista) {
                switch (tipo) {
                    case 'M':
                        obj[0] = obj[0].toString() + "/" + obj[1].toString();
                        obj[1] = formato.format(Double.parseDouble(obj[2].toString()));
                        break;
                    case 'C':
                        obj[1] = formato.format(Double.parseDouble(obj[1].toString()));
                        break;

                }

                ((DefaultTableModel) tabela.getModel()).addRow(obj);
            }

        }
    }

}
