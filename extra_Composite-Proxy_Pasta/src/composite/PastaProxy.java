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
public class PastaProxy extends Composite {

    private Pasta pasta;
    private String user;

    public PastaProxy(String user, String nome, String data) {
        pasta = new Pasta(nome, data);
        this.user = user;
    }

    @Override
    public void getInfo() {
        if (user.equals("admin")) {
            pasta.getInfo();
        } else {
            throw new RuntimeException("Acesso negado");
        }
    }

    @Override
    public boolean addComponente(Componente c) {
        if (user.equals("admin")) {
            return pasta.addComponente(c);
        }
        return false;
    }
}
