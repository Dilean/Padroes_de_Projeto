/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.adapter.AdaptadorP10_P2;
import src.model.Conector;
import src.model.ConectorP10;
import src.model.ConectorP2;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conector p10 = new ConectorP10();
        
        ConectorP2 adaptador = new AdaptadorP10_P2(p10);
        adaptador.conectar();
    }
    
}
