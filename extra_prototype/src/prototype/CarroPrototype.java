/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Dilean
 */
public abstract class CarroPrototype {

    protected String nome;
    protected String valor;

    public abstract void imprimeInfo();

    @Override
    public abstract CarroPrototype clone();

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
