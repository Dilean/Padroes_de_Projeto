/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Dilean
 */
public class Diretor {

    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    private void montarComputador() {
        builder.addMemoria();
        builder.addHD();
        builder.addProcessador();
        builder.addTela();
    }

    public Computador getComputador() {
        montarComputador();
        return builder.getComputador();
    }
}
