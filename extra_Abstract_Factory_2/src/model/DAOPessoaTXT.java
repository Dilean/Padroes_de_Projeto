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
public class DAOPessoaTXT implements PersistenciaTXT {

    @Override
    public void persistirTXT() {
        System.out.println("Persistindo pessoa em TxT");
    }

}
