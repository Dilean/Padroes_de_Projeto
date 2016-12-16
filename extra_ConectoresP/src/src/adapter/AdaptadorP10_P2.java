/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

import src.model.Conector;
import src.model.ConectorP2;

/**
 *
 * @author dilea
 */
public class AdaptadorP10_P2 extends ConectorP2{
    private Conector conector;
    
    public AdaptadorP10_P2(Conector c){
        this.conector = c;
    }
}