/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Chain;

import Model.Funcionario;

/**
 *
 * @author dilea
 */
public class BonusAssiduidade implements IBonus {

    @Override
    public double calcular() {
        return 0.15;
    }

    @Override
    public boolean avaliar(Funcionario f) {
        return f.getFaltasPeriodo("Agosto") <= 5;
    }

}
