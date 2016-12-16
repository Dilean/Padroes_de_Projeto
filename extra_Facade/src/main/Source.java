/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import facade.Facade;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade fachada = new Facade();
        fachada.iniciarSubSistemas();
        fachada.reproduzirAudio("CD qualquer");

        fachada.renderizarVideo("Video qualquer");
    }

}
