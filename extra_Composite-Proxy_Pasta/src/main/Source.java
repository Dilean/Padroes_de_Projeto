/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import composite.Arquivo;
import composite.Componente;
import composite.Composite;
import composite.Pasta;
import composite.PastaProxy;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Composite root = new Pasta("ROOT", "01/12/2016");

        PastaProxy usr = new PastaProxy("admin", "USR", "02/12/2016");
        PastaProxy bin = new PastaProxy("admin", "BIN", "03/12/2016");
        PastaProxy lib = new PastaProxy("admin", "LIB", "04/12/2016");

        Componente arquivo_01 = new Arquivo("Arquivo_01", "05/12/2016");
        Componente arquivo_02 = new Arquivo("Arquivo_02", "05/12/2016");
        Componente arquivo_03 = new Arquivo("Arquivo_03", "05/12/2016");
        Componente arquivo_04 = new Arquivo("Arquivo_04", "05/12/2016");

        usr.addComponente(arquivo_01);
        bin.addComponente(arquivo_02);
        bin.addComponente(arquivo_03);
        lib.addComponente(arquivo_04);

        root.addComponente(usr);
        root.addComponente(bin);
        root.addComponente(lib);

        try {
            root.listarComponentes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
