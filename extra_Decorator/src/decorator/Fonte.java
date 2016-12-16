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
public abstract class Fonte {

    protected String cor = "";
    protected String tamanho = "";
    protected String nome = "";

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getNome() {
        return nome;
    }

}
