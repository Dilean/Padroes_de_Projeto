package src.command;

import src.model.Casamento;
import src.state.FelizState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dilea
 */
public class TerFilhoCommand implements Command {

    private Casamento casamento;

    public TerFilhoCommand(Casamento casamento) {
        this.casamento = casamento;
    }

    @Override
    public void executar() {
        System.err.println(casamento.getCasal() + " tiveram um filho... :D");
        casamento.setEstado(new FelizState());
    }

}
