/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.command.DesistirCommand;
import src.command.ReatarCommand;
import src.command.TrairCommand;
import src.model.Casamento;

/**
 *
 * @author dilea
 */
public class InfelizState extends CasamentoState {

    public InfelizState() {
        super("infeliz");
    }

    @Override
    public void terFilho(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isolar(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desistir(Casamento c) {
        new DesistirCommand(c).executar();
    }

    @Override
    public void trair(Casamento c) {
        new TrairCommand(c).executar();
    }

    @Override
    public void reatar(Casamento c) {
        new ReatarCommand(c).executar();
    }

    @Override
    public void evitar(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
