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
    private int qtdeEstoque;
    private String descricao;

    @OneToMany(mappedBy = "chaveComposta.erva")
    private List<ItemPedido> listaItensPedido;

    public Erva() {
    }
    
//    COM ID
    public Erva(int idErva, String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao) {
        this.idErva = idErva;
        this.nome = nome;
        this.sabor = sabor;
        this.peso = peso;
        this.valor = valor;
        this.qtdeEstoque = qtdeEstoque;
        this.descricao = descricao;
        this.listaItensPedido = listaItensPedido;
    }
    
    public Erva(String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricaodescricao) {
        this.valor = valor;
        this.nome = nome;
        this.sabor = sabor;
        this.peso = peso;
        this.qtdeEstoque = qtdeEstoque;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public List<ItemPedido> getListaItensPedido() {
        return listaItensPedido;
    }

    public void setListaItensPedido(List<ItemPedido> listaItensPedido) {
        this.listaItensPedido = listaItensPedido;
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

    @Override
    public String toString() {
        return idErva + " - " + nome + " - " + sabor;
    }

}
