/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.model.Porta;
import java.util.Scanner;
import src.state.command.trancada.DestrancarCommand;

/**
 *
 * @author dilea
 */
public class PortaTrancadaState implements State {

    @Override
    public void abrir(Porta p) {
        System.out.println("É preciso destrancar a porta...");
        System.out.println("Deseja destrancar a porta?");
        Scanner resp = new Scanner(System.in);
        String r = resp.next();
        if(r.equals("s") || r.equals("S")){
            destrancar(p);
        }
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("A porta já está fechada e trancada");

    }

    @Override
    public void trancar(Porta p) {
        System.out.println("A porta já está trancada");
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("destrancando a porta");
        new DestrancarCommand(p).executar();
    }

}
