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
public class Texto {
    
    private String titulo;
    private String texto;

    public Texto(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }
    
    public Texto(){}

    public TextoMemento getMemento(){
        return new TextoMemento(this.titulo, this.texto);
    }
    
    public void restaurar(TextoMemento m){
        this.texto = m.getTexto();
        this.titulo = m.getTitulo();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void imprimeTexto(){
        System.out.println("TITULO - " + this.titulo + "\n\n" + "TEXTO - " + this.texto);
    }
}
