/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import collections.Pessoas;
import iterator.IIterador;
import model.Pessoa;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        pessoas.addPessoa(new Pessoa("Dilean"));
        pessoas.addPessoa(new Pessoa("Denis"));
        pessoas.addPessoa(new Pessoa("Caique"));
        pessoas.addPessoa(new Pessoa("Lais"));

        IIterador iterator = pessoas.criaIterador();

        //System.out.println(iterator.first().getNome());
        System.out.println("--------------------");
        while (iterator.HasNext()) {
            System.out.println(iterator.next().getNome());
        }
    }

}
