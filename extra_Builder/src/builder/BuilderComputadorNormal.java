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
public class BuilderComputadorNormal extends Builder {

    @Override
    public void addMemoria() {
        computador.memoria = "6Gb - DDR3";
    }

    @Override
    public void addProcessador() {
        computador.processador = "Intel I5 2.6GHz";
    }

    @Override
    public void addHD() {
        computador.HD = "500Gb";
    }

    @Override
    public void addTela() {
        computador.tela = "15'";
    }

}
