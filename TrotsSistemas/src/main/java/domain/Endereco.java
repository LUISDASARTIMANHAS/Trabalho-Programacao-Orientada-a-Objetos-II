package domain;

import java.io.Serializable;
import javax.persistence.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Entity
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    //    CHAVE COM AUTO NUMERAÇÃO
    @Id
    private int idEndereco;

    @Column(nullable = false, length = 9)
    private String cep;

    private String bairro;
    private String logradouro;
    private int numero;
    private String complemento;
    private String referencia;
    private String cidade;

    @Column(nullable = false, length = 2)
    private String uf;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idEndereco")
    private Cliente cliente;

    public Endereco() {
    }

//    com id para CLIENTE
    public Endereco(
            int idEndereco,
            String cep,
            String bairro,
            String logradouro,
            int numero,
            String complemento,
            String referencia,
            String cidadeNome,
            String uf
    ) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
        this.cidade = cidadeNome;
        this.uf = uf;
    }

//    SEM ID para CLIENTE
    public Endereco(
            String cep,
            String bairro,
            String logradouro,
            int numero,
            String complemento,
            String referencia,
            String cidadeNome,
            String uf
    ) {
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
        this.cidade = cidadeNome;
        this.uf = uf;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidadeNome() {
        return cidade;
    }

    public void setCidadeNome(String cidadeNome) {
        this.cidade = cidadeNome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
