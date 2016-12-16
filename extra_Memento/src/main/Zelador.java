/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import memento.TextoMemento;

/**
 *
 * @author Dilean
 */
public class Zelador {

    ArrayList<TextoMemento> mementos;

    public Zelador() {
        mementos = new ArrayList<>();
    }

    public void adicionarMemento(TextoMemento memento) {
        mementos.add(memento);
    }

    public TextoMemento getUltimo() {
        if (!mementos.isEmpty()) {
            TextoMemento memento = mementos.get(0);
            mementos.remove(memento);
            mementos.add(memento);
            return memento;
            
        }
        return null;
    }
}
