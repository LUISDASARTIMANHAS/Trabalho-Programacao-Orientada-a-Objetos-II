/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adaptadores;

import control.EnderecoCep;
import domain.Endereco;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class AdaptadorEndereco {
//
//    Endereco meuEndereco = new Endereco();
//
//    meuEndereco.setNumero ("123");
//    meuEndereco.setComplemento ("Apto 21");
//
//    // Preenche os campos que faltam com base no CEP
//    EnderecoCep viaCepEndereco = consultarCEP("01001000");
//
//    AdaptadorEndereco.converter (meuEndereco, viaCepEndereco);

// Agora `meuEndereco` tem logradouro, bairro, cidade, uf + número e complemento
    public static Endereco converter(Endereco destino, EnderecoCep origem) {
//        origem 
//String logradouro, String bairro, String cidade, String uf
        destino.setLogradouro(origem.getLogradouro());
        destino.setBairro(origem.getBairro());
        destino.setCidade(origem.getCidade());
        destino.setUf(origem.getUf());

        return destino;
    }

}
