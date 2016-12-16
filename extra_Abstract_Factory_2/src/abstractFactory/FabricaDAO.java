/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import model.PersistenciaMySQL;
import model.PersistenciaTXT;

/**
 *
 * @author Dilean
 */
public interface FabricaDAO {

    public PersistenciaTXT CriaDAOTxT();

    public PersistenciaMySQL CriaDAOMySQL();
}
