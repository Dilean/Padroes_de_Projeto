/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.command.DesligarCommand;
import src.model.Lampada;

/**
 *
 * @author dilea
 */
public class LigadaState implements State{

    @Override
    public void desligar(Lampada l) {
        new DesligarCommand().executar(l);
    }

    @Override
    public void ligar(Lampada l) {
        System.err.println("Lampada já está ligada...");
    }
    
}
