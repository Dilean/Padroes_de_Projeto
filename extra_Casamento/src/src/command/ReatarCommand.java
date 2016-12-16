/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.command;

import src.model.Casamento;
import src.state.FelizState;

/**
 *
 * @author dilea
 */
public class ReatarCommand implements Command {

    private Casamento casamento;

    public ReatarCommand(Casamento casamento) {
        this.casamento = casamento;
    }

    @Override
    public void executar() {
        System.err.println(casamento.getCasal() + " reataram o casamento... :D");
        casamento.setEstado(new FelizState());
    }

}
