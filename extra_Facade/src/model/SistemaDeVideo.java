/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dilean
 */
public class SistemaDeVideo {

    public void configurarCor() {
        System.out.println("Frequencia configurada");
    }

    public void configurarVolume() {
        System.out.println("Volume configurado");
    }

    public void configurarCanais() {
        System.out.println("Canais configurados");
    }

    public void configurarResolucao() {
        System.out.println("Resolução configurada");
    }

    public void reproduzirVideo(String arquivo) {
        System.out.println("Reproduzindo: " + arquivo);
    }
}
