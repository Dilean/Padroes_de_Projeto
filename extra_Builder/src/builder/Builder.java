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
public abstract class Builder {

    protected Computador computador;

    public Builder() {
        computador = new Computador();
    }

    public abstract void addMemoria();

    public abstract void addProcessador();

    public abstract void addHD();

    public abstract void addTela();

    public Computador getComputador() {
        return this.computador;
    }
}
