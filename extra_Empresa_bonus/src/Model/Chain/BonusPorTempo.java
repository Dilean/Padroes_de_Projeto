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
public class BonusPorTempo implements IBonus {

    @Override
    public double calcular() {
        return 0.50;
    }

    @Override
    public boolean avaliar(Funcionario f) {
        if (f.getTempoDeTrabalho() == ((f.getQtdBonusTdT() + 1) * 5)) {
            f.addQtdBonusTdT();
            return true;
        }
        return false;
    }
}
