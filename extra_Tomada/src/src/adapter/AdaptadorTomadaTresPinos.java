/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

import src.Tomada;
import src.TomadaTresPinos;

/**
 *
 * @author dilea
 */
public class AdaptadorTomadaTresPinos extends TomadaTresPinos {

    private Tomada tomada;

    public AdaptadorTomadaTresPinos(Tomada tomada) {
        this.tomada = tomada;
    }
}
