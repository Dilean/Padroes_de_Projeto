/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.command;

import src.model.Casamento;
import src.state.InfelizState;

/**
 *
 * @author dilea
 */
public class IsolarCommand implements Command {

    private Casamento casamento;

    public IsolarCommand(Casamento casamento) {
        this.casamento = casamento;
    }

    @Override
    public void executar() {
        System.err.println(casamento.getCasal() + " estão se isolando... isso não vai acabar bem... :/");
        casamento.setEstado(new InfelizState());
    }

}
