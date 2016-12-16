/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import decorator.Decorador;
import decorator.DecoradorCor;
import decorator.DecoradorTamanho;
import decorator.Fonte;
import model.Arial;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fonte fonte = new Arial();
        System.out.println(fonte.getNome()
                + " - " + fonte.getCor()
                + " - " + fonte.getTamanho());
        
        Decorador cor = new DecoradorCor(fonte, "preto");
        System.out.println(cor.getNome()
                + " - " + cor.getCor()
                + " - " + cor.getTamanho());

        Decorador tamanho = new DecoradorTamanho(cor, "12");
        System.out.println(tamanho.getNome()
                + " - " + tamanho.getCor()
                + " - " + tamanho.getTamanho());
    }
}
