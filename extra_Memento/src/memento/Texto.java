/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import main.Zelador;

/**
 *
 * @author Dilean
 */
public class Texto {

    private String texto;
    private String titulo;
    private String autor;
    private Zelador zelador;

    public Texto(String titulo, String texto, String autor) {
        this.autor = autor;
        this.texto = texto;
        this.titulo = titulo;
        zelador = new Zelador();
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void criarMemento() {
        zelador.adicionarMemento(new TextoMemento(this));
    }

    public void desfazer() {
        Texto t = zelador.getUltimo().getTextoSalvo();
        this.titulo = t.getTitulo();
        this.texto = t.getTexto();
        this.autor = t.getAutor();
    }

    public void refazer() {
        Texto t = zelador.getUltimo().getTextoSalvo();
        this.titulo = t.getTitulo();
        this.texto = t.getTexto();
        this.autor = t.getAutor();
    }

    public void imprimeInfo() {
        System.out.println("Titulo:" + titulo + "\n"
                + "Texto: " + texto + "\n"
                + "Autor: " + autor + "\n");
    }

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

}
