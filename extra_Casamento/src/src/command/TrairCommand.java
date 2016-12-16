/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.command;

import src.model.Casamento;
import src.state.DivorcioState;

/**
 *
 * @author dilea
 */
public class TrairCommand implements Command {

    private Casamento casamento;

    public TrairCommand(Casamento casamento) {
        this.casamento = casamento;
    }
    
    @Override
    public void executar() {
        System.err.println("Alguém levou chifre!!!");
        casamento.setEstado(new DivorcioState());
    }
}
