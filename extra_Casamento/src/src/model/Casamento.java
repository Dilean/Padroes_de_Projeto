/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.state.CasamentoState;
import src.state.FelizState;

/**
 *
 * @author dilea
 */
public class Casamento {

    private CasamentoState estado;
    private String esposo;
    private String esposa;

    public Casamento(String esposo, String esposa) {
        this.esposo = esposo;
        this.esposa = esposa;
        this.estado = new FelizState();
        infoStatus();
    }

    public String getCasal() {
        return esposo + " e " + esposa;
    }

    public void setEstado(CasamentoState s) {
        this.estado = s;
    }

    private void infoStatus() {
        System.out.println("O casal está" + estado.info());
    }

    public void evitar() {
        estado.evitar(this);
        //infoStatus();
    }

    public void reatar() {
        estado.reatar(this);
        //infoStatus();
    }

    public void trair() {
        estado.trair(this);
        //infoStatus();
    }

    public void isolar() {
        estado.isolar(this);
        //infoStatus();
    }

    public void terFilho() {
        estado.terFilho(this);
        //infoStatus();
    }
    
    public void desistir(){
        estado.desistir(this);
        //estado.info();
    }
}
