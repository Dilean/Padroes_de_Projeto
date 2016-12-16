/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.memento;

import java.util.ArrayList;
import src.memento.model.TextoMemento;

/**
 *
 * @author dilea
 */
public class Zelador {

    protected ArrayList<TextoMemento> backups;

    public Zelador() {
        this.backups = new ArrayList<>();
    }

    public TextoMemento getUltimoEstado() {
        return backups.get(backups.size() - 1);
    }

    public void addMemento(TextoMemento m) {
        if (backups.size() >= 10) {
            backups.remove(0);
        }
        backups.add(m);
    }
}
