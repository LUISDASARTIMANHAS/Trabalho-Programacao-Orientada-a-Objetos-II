/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Entity
public class Venda {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idVenda;
    
    @Temporal(value = TemporalType.DATE)
    private java.util.Date data;
    
    @Column(nullable = false, columnDefinition = "FLOAT DEFAULT 0.0")
    private float valorTotal;
    
    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name = "idCliente" )    
    private Cliente cliente;
    
    
    @OneToMany ( mappedBy = "chaveComposta.venda", cascade = CascadeType.ALL)
    private List<ItemPedido> listaItensPedido;

    public Venda() {
    }
    
//    COM ID
    public Venda(int idVenda,Cliente cliente, Date data, float valorTotal, List<ItemPedido> listaItensPedido) {
        this.idVenda = idVenda;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.listaItensPedido = listaItensPedido;
    }

//    SEM ID
    public Venda(Cliente cliente, float valorTotal, List<ItemPedido> listaItensPedido) {
        this.data = new Date();
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.listaItensPedido = listaItensPedido;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getListaItensPedido() {
        return listaItensPedido;
    }

    public void setListaItensPedido(List<ItemPedido> listaItensPedido) {
        this.listaItensPedido = listaItensPedido;
    }
    
//    para renderização do auto table model;
    public String getNomeCliente() {
        return cliente.toString();
    }
    
     public String getDataVenda() {
        return data.toString();
    }

    
}