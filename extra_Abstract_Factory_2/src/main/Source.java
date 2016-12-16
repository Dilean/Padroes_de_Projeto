/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import abstractFactory.FabricaAbstrata;
import abstractFactory.FabricaDAO;
import model.PersistenciaMySQL;
import model.PersistenciaTXT;

/**
 *
 * @author Dilean
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaAbstrata fab = FabricaAbstrata.getInstancia();

        FabricaDAO pessoaDAO = fab.criarFabricaPessoa();
        PersistenciaMySQL daoPeMy = pessoaDAO.CriaDAOMySQL();
        daoPeMy.persistirMYSQL();
        PersistenciaTXT daoPeTx = pessoaDAO.CriaDAOTxT();
        daoPeTx.persistirTXT();

        FabricaDAO produtoDAO = fab.criarFabricaProduto();
        PersistenciaMySQL daoPrMy = produtoDAO.CriaDAOMySQL();
        daoPrMy.persistirMYSQL();
        PersistenciaTXT daoPrTx = produtoDAO.CriaDAOTxT();
        daoPrTx.persistirTXT();
    }

}
