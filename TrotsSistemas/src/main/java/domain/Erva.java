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
public class Erva implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    
    @Column (nullable = false,length = 100)
    private String nome;
    
    @Column (nullable = false)
    private String sabor;
    
    @Column (nullable = false)
    private int peso;
    
    @Column (nullable = false)
    private float Valor;
    

    public Erva() {
    }

    public Erva(float Valor, String Nome, String Sabor, int peso) {
        this.Valor = Valor;
        this.nome = Nome;
        this.sabor = Sabor;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String Sabor) {
        this.sabor = Sabor;
    }
    

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
