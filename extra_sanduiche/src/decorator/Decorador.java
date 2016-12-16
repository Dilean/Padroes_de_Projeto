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
public class Decorador extends Decorado {

    private Decorado decorado;
    private String d;
    private double p;

    public Decorador(Decorado d, String descricao, double preco) {
        this.decorado = d;
        this.d = descricao;
        this.p = preco;
    }

    public Decorado reverter() {
        return this.decorado;
    }

    @Override
    public String getDescricao() {
        return decorado.getDescricao() + " + " + d;
    }

    @Override
    public double getPreco() {
        return decorado.getPreco() + p;
    }
}
