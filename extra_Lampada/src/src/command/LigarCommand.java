/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.command;

import src.model.Lampada;
import src.state.LigadaState;

/**
 *
 * @author dilea
 */
public class LigarCommand implements Command{

    @Override
    public void executar(Lampada l) {
        System.out.println("Ligando lampada...");
        l.setEstado(new LigadaState());
    }
    
}
