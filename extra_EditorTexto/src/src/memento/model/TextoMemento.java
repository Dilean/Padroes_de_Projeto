/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.memento.model;

/**
 *
 * @author dilea
 */
public class TextoMemento {

    private String titulo;
    private String texto;

    public TextoMemento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    String getTitulo() {
        return titulo;
    }

    String getTexto() {
        return texto;
    }
}
