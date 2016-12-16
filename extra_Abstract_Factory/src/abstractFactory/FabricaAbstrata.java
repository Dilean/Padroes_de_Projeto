/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import abstractFactory.factory.FabricaFiat;
import abstractFactory.factory.Fabrica;
import abstractFactory.factory.FabricaFord;

/**
 *
 * @author Dilean
 */
public class FabricaAbstrata {

    public Fabrica CriaFabricaFiat() {
        return new FabricaFiat();
    }

    public Fabrica CriarFabricaFord() {
        return new FabricaFord();
    }
}
