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
    
    @EmbeddedId
    private ItemPedidoPK chaveComposta;
    
    private String Tipo;
    private int Qdte;
    private float ValorDaUnidade;
    
    public ItemPedido() {
    }

    public ItemPedido(Erva erva, Venda venda, String tipo, int qdte) {
//        anexa a erva com a venda e retorna um itemPedidoPk;
        this.chaveComposta = new ItemPedidoPK(erva, venda);
        this.Tipo = tipo;
        this.Qdte = qdte;
//        usado para salvar no banco o valor atual naquela compra.
//        para caso o valor da erva mude futuramente
        this.ValorDaUnidade = chaveComposta.getErva().getValor();
    }

    public Erva getErva() {
        return chaveComposta.getErva();
    }
    
    public void setErva(Erva erva) {
        this.chaveComposta.setErva(erva);
    }

    public float getValorDaUnidade() {
        return ValorDaUnidade;
    }
    
    public Venda getVenda() {
        return chaveComposta.getVenda();
    }
    
    public void setVenda(Venda venda) {
        this.chaveComposta.setVenda(venda);
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getQdte() {
        return Qdte;
    }

    public void setQdte(int Qdte) {
        this.Qdte = Qdte;
    }

//    METODOS IMPORTADAS PARA QUE O AUTO TABLE MODEL ADICIONE NA TABELA 
    public float getSubTotal() {
        return  getQdte() * getValorDaUnidade();
    }
}
