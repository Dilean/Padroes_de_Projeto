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
public class BonusNormal implements IBonus {

    @Override
    public double calcular() {
        return 0.10;
    }

    @Override
    public boolean avaliar(Funcionario f) {
        return f.getMeta().equals("C");
    }
}
