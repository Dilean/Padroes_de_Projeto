/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.command.LigarCommand;
import src.model.Lampada;

/**
 *
 * @author dilea
 */
public class DesligadaState implements State{

    @Override
    public void desligar(Lampada l) {
        System.err.println("Lampada já está desligada");
    }

    @Override
    public void ligar(Lampada l) {
        new LigarCommand().executar(l);
    }
    
}
