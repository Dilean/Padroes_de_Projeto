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
public class DecoradorCor extends Decorador {

    private String cor;

    public DecoradorCor(Fonte f, String c) {
        super(f);
        cor = c;
    }

    @Override
    public String getCor() {
        return fonte.cor + cor;
    }

    @Override
    public String getTamanho() {
        return fonte.getTamanho();
    }

    @Override
    public String getNome() {
        return fonte.getNome();
    }
}
