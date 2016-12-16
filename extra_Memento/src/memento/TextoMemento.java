/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Dilean
 */
public class TextoMemento {

    private String texto;
    private String titulo;
    private String autor;

    public TextoMemento(Texto t) {
        this.titulo = t.getTitulo();
        this.texto = t.getTexto();
        this.autor = t.getAutor();
    }

    public Texto getTextoSalvo() {
        return new Texto(titulo, texto, autor);
    }

}
