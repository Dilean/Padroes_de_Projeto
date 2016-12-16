/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.state.PortaAbertaState;
import src.state.State;

/**
 *
 * @author dilea
 */
public class Porta {
    private State estado;
    private String nomeEstado;
    
    public Porta(){
        this.nomeEstado = "porta aberta, entre!";
        this.estado = new PortaAbertaState();
    }
    
    public void setEstado(State e){
        this.estado = e;
    }
    
    public void abrir(){
        estado.abrir(this);
    }
    
    public void fechar(){
        estado.fechar(this);
    }
    
    public void trancar(){
        estado.trancar(this);
    }
    
    public void destrancar(){
        estado.destrancar(this);
    }
    
    public void infoEstado(){
        System.out.println(this.nomeEstado);
    }
    
    public void setNomeEstado(String n){
        this.nomeEstado = n;
    }
}
