/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Mediator.Mediator;
import collegue.Collegue;
import collegue.CollegueDois;
import collegue.CollegueUm;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mediator med = new Mediator();
        
        Collegue um = new CollegueUm(med);
        Collegue dois = new CollegueDois(med);

        med.addCollegue(um);
        med.addCollegue(dois);

        um.enviarMensagem("oi sou o 1");
        dois.enviarMensagem("oie eu sou o 2");
    }

}
