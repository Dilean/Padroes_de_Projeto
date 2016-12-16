/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import Model.Funcionario;
import Model.Gerente;
import Model.Chain.BonusAssiduidade;
import Model.Chain.BonusNormal;
import Model.Chain.BonusPorTempo;
import Model.Chain.ProcessadorBonus;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario ger = new Gerente();
        ger.setSalario(5.000);
        ger.setCPF("000.000.000-00");
        ger.setIdade(25);
        ger.addFalta("Agosto", 10);
        ger.setNome("Reinaldo");
        ger.setTempoDeTrabalho(2);
        ger.setMeta("C");
        
        ProcessadorBonus processa = new ProcessadorBonus(ger);
        
        processa.addProcessador(new BonusPorTempo());
        processa.addProcessador(new BonusAssiduidade());
        processa.addProcessador(new BonusNormal());
        
        processa.processarBonus();
        System.out.println(ger.getBonificacao());
    }
    
}
