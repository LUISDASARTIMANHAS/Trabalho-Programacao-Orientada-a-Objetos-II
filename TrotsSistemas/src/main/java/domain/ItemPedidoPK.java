/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Embeddable
public class ItemPedidoPK implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn (name = "idErva")
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