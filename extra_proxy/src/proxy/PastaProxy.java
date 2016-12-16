/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Dilean
 */
public class PastaProxy implements IPasta {

    private final IPasta pasta;
    private final String user;
    private final String senha;

    public PastaProxy(IPasta pasta, String user, String senha) {
        this.pasta = pasta;
        this.user = user;
        this.senha = senha;
    }

    @Override
    public String getInformacao() {
        return pasta.getInformacao();
    }

    @Override
    public void setInformacao(String informacao) {
        if (user.equals("admin") && senha.equals("111")) {
            pasta.setInformacao(pasta.getInformacao() + " " + informacao);
        }
    }

}
