/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Entity
public class Erva implements Serializable {

    private static final long serialVersionUID = 1L;

    //    CHAVE COM AUTO NUMERAÇÃO
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idErva;

    @Column(nullable = false, length = 100)
    private String nome;
    private String sabor;
    private int peso;
    private float valor;

    @OneToMany ( mappedBy = "chaveComposta.erva")
    private List<ItemPedido> listaItensPedido;
    
    public Erva() {
    }

    public Erva(float valor, String Nome, String Sabor, int peso) {
        this.valor = valor;
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
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIdErva() {
        return idErva;
    }

    public void setIdErva(int idErva) {
        this.idErva = idErva;
    }

}
