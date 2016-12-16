/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import model.SistemaDeAudio;
import model.SistemaDeVideo;

/**
 *
 * @author Dilean
 */
public class Facade {

    protected SistemaDeAudio audio;
    protected SistemaDeVideo video;

    public void iniciarSubSistemas() {
        audio = new SistemaDeAudio();
        audio.configurarVolume();

        video = new SistemaDeVideo();
        video.configurarResolucao();
        video.configurarCor();
        video.configurarCanais();
        video.configurarVolume();
    }
    
    public void renderizarVideo(String arquivo){
        video.reproduzirVideo(arquivo);
    }
    
    public void reproduzirAudio(String arquivo){
        audio.reproduzirAudio(arquivo);
    }

}
