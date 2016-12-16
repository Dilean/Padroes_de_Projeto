/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.xml.ws.spi.Invoker;
import memento.Texto;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto t = new Texto("Titulo 01", "Um texto qualquer", "Dilean");
        
        t.criarMemento();
        t.imprimeInfo();
        
        t.setAutor("Lais");
        t.criarMemento();
        t.imprimeInfo();
        
        t.desfazer();
        t.imprimeInfo();
        
        t.refazer();
        t.imprimeInfo();
    }
    
}
