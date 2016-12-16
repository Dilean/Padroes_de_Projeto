/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

/**
 *
 * @author dilea
 */
public class Texto {
    private String titulo;
    private String texto;
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public void setTexto(String txt){
        this.texto = txt;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getTexto(){
        return this.texto;
    }
    
    public String getTxtCompleto(){
        return "INICIO: \n\n   " + this.titulo + "\n   " + this.texto + "\n\n FIM:";
    }
}
