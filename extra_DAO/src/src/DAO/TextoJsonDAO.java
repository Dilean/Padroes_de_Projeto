/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.DAO;

/**
 *
 * @author dilea
 */
public class TextoJsonDAO extends TextoDAO{

        @Override
    public boolean persistir(String t) {
        System.out.println("Persistindo o texto: \n\n   " + t + " no formato JSON");
        return true;
    }

    @Override
    public String getTexto(String t) {
        System.out.println("Recuperando o texto de titulo: " + t);
        return "acho";
    }

    @Override
    public boolean findTexto(String t) {
        System.out.println("Pesquisando o titulo: " + t);
        return true;
    }
    
}
