/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.swing.Icon;
import swing.LDASwingUtils;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    //    CHAVE COM AUTO NUMERAÇÃO
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    
    @Column (nullable = false,length = 100)
    private String nome;
    
    @Column (unique = true,nullable = false,length = 14,updatable = false)
    private String cpf;
    
    @Column (nullable = false)
    private String email;
    
    @Column (length = 15)
    private String tel;
    
    @Lob
    private byte[] foto;
    
    
    @OneToOne (mappedBy = "cliente", cascade = CascadeType.ALL)
    private domain.Endereco endereco;
    
    @ManyToOne
    @JoinColumn (name = "idCidade")
    private Cidade cidade;
    
    @OneToMany ( mappedBy = "cliente", fetch = FetchType.LAZY )
    private List<Venda> Vendas;

//    para hibernate 
    public Cliente() {
    }

//    sem id
    public Cliente(String nome, String cpf, String email, String tel,Icon Foto, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
        this.foto = LDASwingUtils.IconToBytes(Foto);
//        amarro o endereço no cliente
        this.endereco.setCliente(this);
    }

//    com id
    public Cliente(int id, String nome, String cpf, String email, String tel,Icon Foto,  Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tel = tel;
        this.endereco = endereco;
        this.foto = LDASwingUtils.IconToBytes(Foto);
//        amarro o endereço no cliente
        this.endereco.setCliente(this);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
}
