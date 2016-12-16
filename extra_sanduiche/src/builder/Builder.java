/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import decorator.Decorado;
import decorator.PaoFrances;

/**
 *
 * @author Dilean
 */
public abstract class Builder {

    protected Decorado decorado;

    public Builder() {
        decorado = new PaoFrances();
    }

    public abstract void addIngrediente();

    public abstract void addCarne();

    public Decorado getSanduiche() {
        addIngrediente();
        addCarne();
        return decorado;
    }
}
