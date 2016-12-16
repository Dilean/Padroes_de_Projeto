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
public interface IBonus {

    public double calcular();

    public boolean avaliar(Funcionario f);
}
