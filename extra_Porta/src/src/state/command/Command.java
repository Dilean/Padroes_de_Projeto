/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state.command;

import src.model.Porta;

/**
 *
 * @author dilea
 */
public abstract class Command {
    
    protected Porta p;
    
    public Command(Porta p){
        this.p = p;
    }
    
    public abstract void executar();
}
