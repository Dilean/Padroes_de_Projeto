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
public class Decorado {

    protected String descricao = "";
    protected double preco = 0.0;

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }
}
