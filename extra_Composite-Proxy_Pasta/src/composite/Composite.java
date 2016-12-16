/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author Dilean
 */
public abstract class Composite extends Componente {

    protected ArrayList<Componente> componentes;

    public Composite() {
        componentes = new ArrayList<>();
    }

    public boolean addComponente(Componente c) {
        return componentes.add(c);
    }

    @Override
    public void listarComponentes() {
        for (Componente c : componentes) {
            c.getInfo();
        }
    }
}
