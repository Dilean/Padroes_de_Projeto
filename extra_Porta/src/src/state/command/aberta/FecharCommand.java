/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state.command.aberta;

import src.state.command.*;
import src.model.Porta;
import src.state.PortaFechadaState;

/**
 *
 * @author dilea
 */
public class FecharCommand extends Command{

    public FecharCommand(Porta p) {
        super(p);
    }

    @Override
    public void executar() {
        p.setNomeEstado("porta fechada");
        p.setEstado(new PortaFechadaState());
    }
    
}
