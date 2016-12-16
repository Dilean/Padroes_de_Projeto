/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.memento.model.Texto;
import src.memento.Zelador;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto texto = new Texto("primeiro texto", "Um texto qualquer");
        texto.imprimeTexto();
        Zelador zelador = new Zelador();
        zelador.addMemento(texto.getMemento());
        texto.setTexto("Outro texto");
        texto.imprimeTexto();
        texto.restaurar(zelador.getUltimoEstado());
        texto.imprimeTexto();
    }
}
