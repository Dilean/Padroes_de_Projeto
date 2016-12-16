/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.factory;

import src.DAO.TextoDAO;
import src.DAO.TextoJsonDAO;

/**
 *
 * @author dilea
 */
public class TextoJsonDAOFactory implements FactoryDAO{

    @Override
    public TextoDAO criarDAO() {
        return new TextoJsonDAO();
    }
}
