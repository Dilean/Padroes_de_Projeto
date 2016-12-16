/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state.command.destrancada;

import src.state.command.*;
import src.model.Porta;
import src.state.PortaAbertaState;

/**
 *
 * @author dilea
 */
public class AbrirCommand extends Command{

    public AbrirCommand(Porta p) {
        super(p);
    }

    @Override
    public void executar() {
        p.setNomeEstado("porat aberta");
        p.setEstado(new PortaAbertaState());
    }
}