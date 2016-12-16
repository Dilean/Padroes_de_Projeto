/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegue;

import Mediator.Mediator;

/**
 *
 * @author Dilean
 */
public class CollegueDois extends Collegue {

    public CollegueDois(Mediator m) {
        super(m);
    }

    @Override
    public void receverMensagem(String mensagem) {
        System.out.println("Mensagem recebida Collegue 2: " + mensagem);
    }

}
