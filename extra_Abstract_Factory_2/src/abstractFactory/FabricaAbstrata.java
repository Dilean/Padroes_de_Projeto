/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author Dilean
 */
public class FabricaAbstrata {

    private static FabricaAbstrata instancia;
    private FabricaDAO pessoa;
    private FabricaDAO produto;

    private FabricaAbstrata() {
    }

    public static FabricaAbstrata getInstancia() {
        if (instancia == null) {
            instancia = new FabricaAbstrata();
        }
        return instancia;
    }

    public FabricaDAO criarFabricaPessoa() {
        if (pessoa == null) {
            pessoa = new FabricaDAOPessoa();
        }
        return pessoa;
    }

    public FabricaDAO criarFabricaProduto() {
        if (produto == null) {
            produto = new FabricaDAOProduto();
        }
        return produto;
    }

}
