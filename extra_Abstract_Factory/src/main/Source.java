/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import abstractFactory.FabricaAbstrata;
import model.CarroPopular;
import model.CarroSedan;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaAbstrata fab = new FabricaAbstrata();

        CarroPopular popularFiat = fab.CriaFabricaFiat().criarPopular();
        popularFiat.exibeInfoPopular();

        CarroSedan sedanFord = fab.CriarFabricaFord().criarSedan();
        sedanFord.exibeInfoSedan();
    }

}
