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
    private static final long serialVersionUID = 1L;
    
//    CHAVE COM AUTO NUMERAÇÃO
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private String Obs;
    
    @Column(nullable = false)
    private int Qdte;
    
    @Transient
    private Erva Erva;

    public ItemPedido() {
    }

    public ItemPedido(Erva Erva, String Obs, int Qdte) {
        this.Erva = Erva;
        this.Obs = Obs;
        this.Qdte = Qdte;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public Erva getErva() {
        return Erva;
    }

    public void setErva(Erva Erva) {
        this.Erva = Erva;
    }

    public int getQdte() {
        return Qdte;
    }

    public void setQdte(int Qdte) {
        this.Qdte = Qdte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
