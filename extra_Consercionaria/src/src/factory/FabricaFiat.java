/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.factory;

import src.model.Carro;
import src.model.FiatPalio;
import src.model.FiatUno;

/**
 *
 * @author dilea
 */
public class FabricaFiat extends FabricaCarros{

    @Override
    public Carro criarCarro(String nome) {
        switch(nome){
            case "Uno":
                return new FiatUno("Uno","32.000","Fiat","Strada","150 cavalos");
            case "Palio":
                return new FiatPalio("Palio","30.000","Fiat","Strada","120 cavalos");
            default:
                return null;
        }   
    }
}
