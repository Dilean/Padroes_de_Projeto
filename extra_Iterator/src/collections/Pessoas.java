/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import iterator.IIterador;
import iterator.IteradorPessoa;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Dilean
 */
public class Pessoas implements IIteradorPessoa{

    ArrayList<Pessoa> pessoas;

    public Pessoas() {
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void remPessoa(Pessoa p) {
        pessoas.remove(p);
    }

    @Override
    public IIterador criaIterador() {
        return new IteradorPessoa(pessoas);
    }
}
