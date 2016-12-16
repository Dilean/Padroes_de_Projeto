/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.model.Casamento;

/**
 *
 * @author dilea
 */
public abstract class CasamentoState {

    private String info;

    public CasamentoState(String estado) {
        this.info = estado;
    }

    public abstract void terFilho(Casamento c);

    public abstract void isolar(Casamento c);

    public abstract void desistir(Casamento c);

    public abstract void trair(Casamento c);

    public abstract void reatar(Casamento c);

    public abstract void evitar(Casamento c);

    public String info() {
        return this.info;
    }
}
