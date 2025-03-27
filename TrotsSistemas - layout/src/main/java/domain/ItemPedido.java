/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ItemPedido {

    private Erva Erva;
    private String Obs;
    private int Qdte;

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

}
