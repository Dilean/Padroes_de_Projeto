/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.model.Casamento;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casamento casamento = new Casamento("Ricardo", "Maria");
        casamento.isolar();
        casamento.desistir();
        casamento.evitar();
    }
    
}
