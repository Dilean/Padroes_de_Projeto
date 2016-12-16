/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Dilean
 */
public abstract class Decorador extends Fonte {

    protected Fonte fonte;

    public Decorador(Fonte fonte) {
        this.fonte = fonte;
    }
}
