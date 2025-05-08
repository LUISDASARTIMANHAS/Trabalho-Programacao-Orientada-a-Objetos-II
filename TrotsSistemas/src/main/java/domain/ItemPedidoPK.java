/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import javax.persistence.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Embeddable
public class ItemPedidoPK {
    
    @ManyToOne
    @JoinColumn (name = "idLanche")
    private Erva erva;
    
    @ManyToOne
    @JoinColumn (name = "idPedido")
    private Venda venda;

    public ItemPedidoPK(Erva erva, Venda venda) {
        this.erva = erva;
        this.venda = venda;
    }

    public ItemPedidoPK() {
    }

    public Erva getErva() {
        return erva;
    }

    public void setErva(Erva erva) {
        this.erva = erva;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
}



//
//
//@
//public class ItemPedidoPK implements Serializable {
//        
//    @ManyToOne
//    @JoinColumn (name = "idLanche")
//    private Lanche lanche;
//    
//    @ManyToOne
//    @JoinColumn (name = "idPedido")
//    private Pedido pedido;
//
//    public ItemPedidoPK(Lanche lanche, Pedido pedido) {
//        this.lanche = lanche;
//        this.pedido = pedido;
//    }
//
//    public ItemPedidoPK() {
//    }
//
//    public Lanche getLanche() {
//        return lanche;
//    }
//
//    public void setLanche(Lanche lanche) {
//        this.lanche = lanche;
//    }
//
//    public Pedido getPedido() {
//        return pedido;
//    }
//
//    public void setPedido(Pedido pedido) {
//        this.pedido = pedido;
//    }
// 
//    
//    
//}
