/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import builder.BuilderComputadorGamer;
import builder.Computador;
import builder.Diretor;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diretor diretor = new Diretor(new BuilderComputadorGamer());
        Computador gamer = diretor.getComputador();
        gamer.info();
    }

}
