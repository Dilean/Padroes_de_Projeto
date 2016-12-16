/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.model.Porta;
import src.state.command.fechada.AbrirCommand;
import src.state.command.fechada.TrancarCommand;

/**
 *
 * @author dilea
 */
public class PortaFechadaState implements State {

    @Override
    public void abrir(Porta p) {
        System.out.println("abrindo porta");
        new AbrirCommand(p).executar();
    }

    @Override
    public void fechar(Porta p) {
         System.out.println("a porta já está fechada");
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("trancando a porta");
        new TrancarCommand(p).executar();
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Você não trancou a porta... por que raios ta querendo destrancar?");
    }
}
