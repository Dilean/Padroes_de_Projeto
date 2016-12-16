/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Dilean
 */
public class IteradorPessoa implements IIterador {

    private ArrayList<Pessoa> pessoas;
    private int contador;

    public IteradorPessoa(ArrayList<Pessoa> p) {
        pessoas = new ArrayList<>();
        pessoas.addAll(p);
        contador = 0;
    }

    @Override
    public boolean HasNext() {
        return (contador) < pessoas.size();
    }

    @Override
    public Pessoa next() {
        return pessoas.get(contador++);
    }

    @Override
    public Pessoa first() {
        return pessoas.get(0);
    }

    @Override
    public Pessoa corrente() {
        return pessoas.get(contador);
    }

}
