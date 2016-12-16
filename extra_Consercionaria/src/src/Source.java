package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import src.chain.ProcessadorVeiculo;
import src.factory.FabricaCarros;
import src.factory.FabricaFiat;
import src.factory.FabricaFord;
import src.factory.FabricaHonda;
import src.model.Carro;

/**
 *
 * @author dilea
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaCarros fiat = new FabricaFiat();
        FabricaCarros ford = new FabricaFord();
        FabricaCarros honda = new FabricaHonda();

        fiat.addCarro("Palio");
        fiat.addCarro("Uno");
        ford.addCarro("Ka");
        ford.addCarro("Fiesta");
        honda.addCarro("Civic");
        honda.addCarro("Fit");

        ProcessadorVeiculo processador = new ProcessadorVeiculo();
        processador.addFabricas(ford);
        processador.addFabricas(fiat);
        processador.addFabricas(honda);

        Carro palio = processador.processar("C4");
        if (palio != null) {
            palio.exibirInfo();
        } else {
            System.err.println("Não foi possível criar o carro");
        }
    }
}
