/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import model.DAOPessoaMySQL;
import model.DAOPessoaTXT;
import model.DAOProdutoMySQL;
import model.DAOProdutoTXT;
import model.PersistenciaMySQL;
import model.PersistenciaTXT;

/**
 *
 * @author Dilean
 */
public class FabricaDAOProduto implements FabricaDAO {

    private PersistenciaMySQL produtoMySQL;
    private PersistenciaTXT produtoTXT;

    @Override
    public PersistenciaTXT CriaDAOTxT() {
        if (produtoTXT == null) {
            produtoTXT = new DAOProdutoTXT();
        }
        return produtoTXT;
    }

    @Override
    public PersistenciaMySQL CriaDAOMySQL() {
        if (produtoMySQL == null) {
            produtoMySQL = new DAOProdutoMySQL();
        }
        return produtoMySQL;
    }

}
