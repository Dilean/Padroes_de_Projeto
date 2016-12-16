/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.command;

import src.model.Lampada;

/**
 *
 * @author dilea
 */
public interface Command {
    
    public void executar(Lampada l);
}
