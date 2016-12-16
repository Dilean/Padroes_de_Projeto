package collegue;

import Mediator.Mediator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dilean
 */
public abstract class Collegue {

    private Mediator mediator;

    public Collegue(Mediator m) {
        this.mediator = m;
    }

    public void enviarMensagem(String mensagem) {
        mediator.enviar(this, mensagem);
    }

    public abstract void receverMensagem(String mensagem);
}
