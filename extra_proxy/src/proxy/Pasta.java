/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Dilean
 */
public class Pasta implements IPasta {

    private String informacao;

    public Pasta() {
        this.informacao = "qualquer coisa";
    }

    @Override
    public String getInformacao() {
        return informacao;
    }

    @Override
    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
}
