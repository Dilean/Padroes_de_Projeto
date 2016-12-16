/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import java.util.Scanner;
import src.model.Porta;
import src.state.command.aberta.AbrirCommand;
import src.state.command.aberta.FecharCommand;

/**
 *
 * @author dilea
 */
public class PortaAbertaState implements State{

    @Override
    public void abrir(Porta p) {
        System.out.println("a porta já está aberta");
        new AbrirCommand(p).executar();
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("fechando a porta");
        new FecharCommand(p).executar();
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("é necessário fechar a porta antes de tranca-la");
        System.out.println("deseja fecha-la? (S / N)");
        Scanner resp = new Scanner(System.in);
        String r = resp.next();
        if("S".equals(r) || "s".equals(r)){
            fechar(p);
        }
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("para destrancar a porta ela deve estar trancada... tonto!");
    }
    
}
