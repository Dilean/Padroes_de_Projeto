/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.chain;

import java.util.ArrayList;
import src.factory.FabricaCarros;
import src.model.Carro;

/**
 *
 * @author dilea
 */
public class ProcessadorVeiculo {

    private ArrayList<FabricaCarros> fabricas;

    public ProcessadorVeiculo() {
        fabricas = new ArrayList<>();
    }

    public void addFabricas(FabricaCarros f) {
        fabricas.add(f);
    }

    public Carro processar(String nome) {
        for (FabricaCarros f : fabricas) {
            if (f.avariar(nome)) {
                return f.criarCarro(nome);
            }
        }
        return null;
    }
}
