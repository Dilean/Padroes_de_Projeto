/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.adapter.AdaptadorTomadaDoisPinos;
import src.adapter.AdaptadorTomadaTresPinos;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tomada tresP = new TomadaTresPinos();
        Tomada doisP = new TomadaDoisPinos();
        
        TomadaDoisPinos adaptD = new AdaptadorTomadaDoisPinos(tresP);
        adaptD.conectar();
        
        TomadaTresPinos adaptT = new AdaptadorTomadaTresPinos(doisP);
        adaptT.conectar();
    }
    
}
