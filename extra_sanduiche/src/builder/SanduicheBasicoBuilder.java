/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import decorator.Decorador;

/**
 *
 * @author Dilean
 */
public class SanduicheBasicoBuilder extends Builder {

    @Override
    public void addIngrediente() {
        decorado = new Decorador(decorado, "queijo", 1.50);
        decorado = new Decorador(decorado, "alface", 0.50);
    }

    @Override
    public void addCarne() {
        decorado = new Decorador(decorado, "Carne", 2.00);
    }
}
