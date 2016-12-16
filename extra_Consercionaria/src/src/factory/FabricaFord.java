/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.factory;

import src.model.Carro;
import src.model.FordFiesta;
import src.model.FordKa;

/**
 *
 * @author dilea
 */
public class FabricaFord extends FabricaCarros{

    @Override
    public Carro criarCarro(String nome) {
        switch(nome){
            case "Ka":
                return new FordKa("Ka","45.000","Ford","Sport","150 cavalos");
            case "Fiesta":
                return new FordFiesta("Fiesta","65.000", "Ford","Sedan","220 cavalos");
            default:
                return null;
        }   
    }
    
}
