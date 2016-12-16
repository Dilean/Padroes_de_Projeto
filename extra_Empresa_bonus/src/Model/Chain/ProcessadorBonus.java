/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Chain;

import java.util.ArrayList;
import java.util.List;
import Model.Funcionario;

/**
 *
 * @author dilea
 */
public class ProcessadorBonus {

    private Funcionario funcionario;
    private List<IBonus> processadores = new ArrayList<>();

    public ProcessadorBonus(Funcionario f) {
        this.funcionario = f;
    }

    public void addProcessador(IBonus b) {
        processadores.add(b);
    }

    public void processarBonus() {
        for (IBonus bonus : processadores) {
            if (bonus.avaliar(this.funcionario)) {
                this.funcionario.setBonificacao(bonus.calcular());
            }
        }
    }
}
