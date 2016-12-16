/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import collegue.Collegue;
import java.util.ArrayList;

/**
 *
 * @author Dilean
 */
public class Mediator implements IMediator {

    private ArrayList<Collegue> collegues;

    public Mediator() {
        collegues = new ArrayList<>();
    }

    public void addCollegue(Collegue c) {
        this.collegues.add(c);
    }

    @Override
    public void enviar(Collegue c, String mensagem) {
        for (Collegue col : collegues) {
            if (!col.equals(c)) {
                col.receverMensagem(mensagem);
            }
        }
    }
}
