/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.factory;

import model.CarroSedan;
import model.CarroPopular;
import model.Fiesta;
import model.Palio;

/**
 *
 * @author Dilean
 */
public class FabricaFiat implements Fabrica {

    @Override
    public CarroSedan criarSedan() {
        return new Fiesta();
    }

    @Override
    public CarroPopular criarPopular() {
        return new Palio();
    }

}
