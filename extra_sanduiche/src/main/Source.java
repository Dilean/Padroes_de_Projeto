/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import builder.Builder;
import builder.Diretor;
import builder.SanduicheBasicoBuilder;
import decorator.Decorado;
import decorator.Decorador;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new SanduicheBasicoBuilder();
        Diretor diretor = new Diretor(builder);

        Decorado sanduiche = diretor.criarSanduiche();
        sanduiche = new Decorador(sanduiche, "Bife", 2.0);
        sanduiche = new Decorador(sanduiche, "Bife2", 2.0);

        System.out.println("Descrição: " + sanduiche.getDescricao());
        System.out.println("Preço: " + sanduiche.getPreco());

    }

}
