/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

import src.model.Conector;
import src.model.ConectorP10;

/**
 *
 * @author dilea
 */
public class AdaptadorP2_P10 extends ConectorP10 {

    private Conector conector;

    public AdaptadorP2_P10(Conector c) {
        this.conector = c;
    }
}
