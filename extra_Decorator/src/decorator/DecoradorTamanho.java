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
public class DecoradorTamanho extends Decorador {

    private String tamanho;

    public DecoradorTamanho(Fonte f, String t) {
        super(f);
        tamanho = t;
    }

    @Override
    public String getCor() {
        return fonte.getCor();
    }

    @Override
    public String getTamanho() {
        return fonte.getTamanho() + tamanho;
    }

    @Override
    public String getNome() {
        return fonte.getNome();
    }

}
