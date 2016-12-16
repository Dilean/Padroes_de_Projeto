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
public class Computador {

    String memoria;
    String HD;
    String processador;
    String tela;

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void info() {
        System.out.println("Processador: " + this.processador + "\n"
                + "Memória: " + this.memoria + "\n"
                + "HD: " + this.HD + "\n"
                + "Tela: " + this.tela);
    }
}
