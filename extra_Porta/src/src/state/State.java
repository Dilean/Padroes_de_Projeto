/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.model.Porta;

/**
 *
 * @author dilea
 */
public interface State {
    public void abrir(Porta p);
    public void fechar(Porta p);
    public void trancar(Porta p);
    public void destrancar(Porta p);
}
