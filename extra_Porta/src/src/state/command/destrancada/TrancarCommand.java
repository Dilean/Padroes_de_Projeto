/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state.command.destrancada;

import src.state.command.*;
import src.model.Porta;
import src.state.PortaTrancadaState;

/**
 *
 * @author dilea
 */
public class TrancarCommand extends Command{

    public TrancarCommand(Porta p) {
        super(p);
    }

    @Override
    public void executar() {
        p.setNomeEstado("porta trancada");
        p.setEstado(new PortaTrancadaState());
    }
    
}