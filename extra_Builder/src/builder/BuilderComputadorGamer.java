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
public class BuilderComputadorGamer extends Builder {

    @Override
    public void addMemoria() {
        computador.memoria = "16Gb - DDRL4";
    }

    @Override
    public void addProcessador() {
        computador.processador = "Intel I7 Extrem 2.6GHz";
    }

    @Override
    public void addHD() {
        computador.HD = "2Tb";
    }

    @Override
    public void addTela() {
        computador.tela = "17'";
    }

}
