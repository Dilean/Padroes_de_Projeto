/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Dilean
 */
public class Arquivo extends Componente {

    public Arquivo(String nome, String data) {
        this.data = data;
        this.nome = nome;
    }

    @Override
    public void listarComponentes() {
        this.getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("## O Arquivo " + getNome()
                + " foi criado no dia " + getData() + "\n");
    }

}
