/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author LUIS DAS ARTIMANAHS
 */
@Entity
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    //    CHAVE COM AUTO NUMERAÇÃO
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idCidade;

    @Column(nullable = false, length = 100)
    private String nome;

    public Cidade() {
    }

//    SEM ID
    public Cidade(String nome) {
        this.nome = nome;
    }

//  COM ID
    public Cidade(int idCidade, String nome) {
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return idCidade + " - " + nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        return Objects.equals(this.nome, other.nome);
    }

}
