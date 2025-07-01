/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Erva;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class ErvaDao extends GenericDao{
//    força o programador a não cometer erros;
    public void inserirErva(Erva erva) throws HibernateException, ClassNotFoundException {
        inserir(erva);
    }
    
    //    força o programador a não cometer erros;
    public void alterarErva(Erva erva) throws HibernateException, ClassNotFoundException {
        alterar(erva);
    }
    
    public List<Erva> listar() throws HibernateException, ClassNotFoundException {
        return listar(Erva.class);
    }
}
