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
public class Pasta extends Composite {

    public Pasta(String nome, String data) {
        this.data = data;
        this.nome = nome;
    }

    @Override
    public void getInfo() {
        System.out.println(">> A pasta " + getNome()
                + " foi criada no dia " + getData()
                + "\n" + "Contem os arquivos: \n");
        listarComponentes();
    }
}
