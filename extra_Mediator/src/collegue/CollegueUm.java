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
public class CollegueUm extends Collegue {

    public CollegueUm(Mediator m) {
        super(m);
    }

    @Override
    public void receverMensagem(String mensagem) {
        System.out.println("Mensagem recebida Collegue 1: " + mensagem);
    }

}
