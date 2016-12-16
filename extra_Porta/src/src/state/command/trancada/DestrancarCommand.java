/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state.command.trancada;

import src.state.command.*;
import src.model.Porta;
import src.state.PortaDestrancadaState;

/**
 *
 * @author dilea
 */
public class DestrancarCommand extends Command{

    public DestrancarCommand(Porta p) {
        super(p);
    }

    @Override
    public void executar() {
        p.setNomeEstado("porta destrancada");
        p.setEstado(new PortaDestrancadaState());
    }
    
}
