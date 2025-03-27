/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class Erva {
    
    private float Valor;
    private String Nome;
    private String Sabor;

    public Erva(float Valor, String Nome, String Sabor) {
        this.Valor = Valor;
        this.Nome = Nome;
        this.Sabor = Sabor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }
    

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

}
