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

    private String Sabor;
    private int Codigo;
    private int Qdte;
    private float Peso;
    private float Valor;

    public ItemPedido(int Codigo, String Sabor, int Qdte, float Peso, float Valor) {
        this.Sabor = Sabor;
        this.Codigo = Codigo;
        this.Qdte = Qdte;
        this.Peso = Peso;
        this.Valor = Valor;
    }

    public String getSabor() {
        return Sabor;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getQdte() {
        return Qdte;
    }

    public float getPeso() {
        return Peso;
    }

    public float getValor() {
        return Valor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setQdte(int Qdte) {
        this.Qdte = Qdte;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    
}
