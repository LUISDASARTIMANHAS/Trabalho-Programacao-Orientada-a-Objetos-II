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
@Entity
public class ItemPedido implements Serializable {
    
    @EmbeddedId
    private ItemPedidoPK chaveComposta;
    
    private String Obs;
    private int Qdte;
    
    public ItemPedido() {
    }

    public ItemPedido(Erva erva, Venda venda, String Obs, int Qdte) {
        this.chaveComposta = new ItemPedidoPK(erva, venda);
        this.Obs = Obs;
        this.Qdte = Qdte;
    }

    
    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public int getQdte() {
        return Qdte;
    }

    public void setQdte(int Qdte) {
        this.Qdte = Qdte;
    }

}
