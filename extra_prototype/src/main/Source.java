/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import prototype.CarroFiesta;
import prototype.CarroGol;
import prototype.CarroPrototype;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroFiesta prototipo = new CarroFiesta();
        prototipo.setNome("Fiesta popular");

        CarroPrototype fiesta = prototipo.clone();
        fiesta.setValor("50000.00");
        fiesta.imprimeInfo();

        CarroPrototype fiestaSesan = prototipo.clone();
        fiestaSesan.setValor("75000,00");
        fiestaSesan.imprimeInfo();
    }

}
