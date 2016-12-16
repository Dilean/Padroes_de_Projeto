/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.factory;

import java.util.ArrayList;
import src.model.Carro;

/**
 *
 * @author dilea
 */
public abstract class FabricaCarros {
    
    protected ArrayList<String> carros = new ArrayList<>();
    
    public void addCarro(String nome){
        this.carros.add(nome);
    }
    
    public boolean avariar(String nome){
        return carros.contains(nome);
    }
    
    public abstract Carro criarCarro(String nome);
}
