/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.factory;

import model.CarroPopular;
import model.CarroSedan;
import model.Focus;
import model.Ka;

/**
 *
 * @author Dilean
 */
public class FabricaFord implements Fabrica {

    @Override
    public CarroSedan criarSedan() {
        return new Focus();
    }

    @Override
    public CarroPopular criarPopular() {
        return new Ka();
    }

}
