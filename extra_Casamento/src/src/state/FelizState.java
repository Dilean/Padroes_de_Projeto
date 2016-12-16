/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.state;

import src.command.IsolarCommand;
import src.command.TerFilhoCommand;
import src.command.TrairCommand;
import src.model.Casamento;

/**
 *
 * @author dilea
 */
public class FelizState extends CasamentoState{

    public FelizState() {
        super("feliz");
    }

    @Override
    public void terFilho(Casamento c) {
        new TerFilhoCommand(c).executar();
    }

    @Override
    public void isolar(Casamento c) {
        new IsolarCommand(c).executar();
    }

    @Override
    public void desistir(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void trair(Casamento c) {
        new TrairCommand(c).executar();
    }

    @Override
    public void reatar(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void evitar(Casamento c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
