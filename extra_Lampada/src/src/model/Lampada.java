/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.state.DesligadaState;
import src.state.State;

/**
 *
 * @author dilea
 */
public class Lampada {
    private State estado;
    
    public Lampada(){
        this.estado = new DesligadaState();
        System.out.println("Lampada está desligada");
    }
    
    public void setEstado(State estado){
        this.estado = estado;
    }
    
    public void ligarLampada(){
        estado.ligar(this);
    }
    
    public void desligarLampada(){
        estado.desligar(this);
    }
}
