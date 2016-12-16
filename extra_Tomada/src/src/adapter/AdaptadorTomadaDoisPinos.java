/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

import src.Tomada;
import src.TomadaDoisPinos;

/**
 *
 * @author dilea
 */
public class AdaptadorTomadaDoisPinos extends TomadaDoisPinos {
    
    private Tomada tomada;
    
    public AdaptadorTomadaDoisPinos(Tomada tresP) {
        this.tomada = tomada;
    }
    
}
