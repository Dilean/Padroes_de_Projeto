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
public class DesistirCommand implements Command {

    private Casamento casamento;

    public DesistirCommand(Casamento casamento) {
        this.casamento = casamento;
    }

    @Override
    public void executar() {
        System.err.println(casamento.getCasal() + "se divorciaram... :/");
        casamento.setEstado(new DivorcioState());
    }

}
