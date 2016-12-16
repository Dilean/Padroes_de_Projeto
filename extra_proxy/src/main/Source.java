/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import proxy.IPasta;
import proxy.Pasta;
import proxy.PastaProxy;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPasta pasta = new Pasta();
        IPasta proxy = new PastaProxy(pasta, "admin", "111");
        proxy.setInformacao("algo");
        System.out.println(proxy.getInformacao());
    }

}
