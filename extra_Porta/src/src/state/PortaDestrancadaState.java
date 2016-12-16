/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.model.Porta;
import src.state.command.destrancada.AbrirCommand;
import src.state.command.destrancada.TrancarCommand;

/**
 *
 * @author dilea
 */
public class PortaDestrancadaState implements State{

    @Override
    public void abrir(Porta p) {
        System.out.println("abrindo a porta");
        new AbrirCommand(p).executar();
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("a porta está fechada porém destrancada");
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("trancando a porta");
        new TrancarCommand(p).executar();
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("A porta já está destrancada...");
    }
    
}
