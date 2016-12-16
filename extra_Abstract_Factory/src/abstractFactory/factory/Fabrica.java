/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.factory;

import model.CarroSedan;
import model.CarroPopular;

/**
 *
 * @author Dilean
 */
public interface Fabrica {

    public CarroSedan criarSedan();

    public CarroPopular criarPopular();
}
