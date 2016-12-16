/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import decorator.Decorado;

/**
 *
 * @author Dilean
 */
public class Diretor {

    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    public Decorado criarSanduiche() {
        return builder.getSanduiche();
    }
}
