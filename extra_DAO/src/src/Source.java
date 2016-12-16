/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.DAO.TextoDAO;
import src.DAO.TextoXmlDAO;
import src.factory.TextoJsonDAOFactory;
import src.model.Texto;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto t = new Texto();
        t.setTitulo("TITULO");
        t.setTexto("TEXTO, TEXTO, TEXTO");
        System.out.println(t.getTxtCompleto());
        
        TextoDAO persistencia = new TextoJsonDAOFactory().criarDAO();
        persistencia.persistir(t.getTxtCompleto());
    } 
}
