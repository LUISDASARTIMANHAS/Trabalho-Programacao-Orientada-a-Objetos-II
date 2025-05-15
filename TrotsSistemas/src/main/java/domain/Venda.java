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
    private int idVenda;
    
    @Temporal(value = TemporalType.DATE)
    private java.util.Date data;
    
    private float valorTotal;
    
    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name = "idCliente" )    
    private Cliente cliente;
    
    
    @OneToMany ( mappedBy = "chaveComposta.venda")
    private List<ItemPedido> listaItensPedido;

//    COM ID
    public Venda(int idVenda, Date data, float valorTotal) {
        this.idVenda = idVenda;
        this.data = data;
        this.valorTotal = valorTotal;
    }

//    SEM ID
    public Venda(Date data, float valorTotal) {
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

}