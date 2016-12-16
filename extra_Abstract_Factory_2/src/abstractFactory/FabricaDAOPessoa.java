/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import model.DAOPessoaMySQL;
import model.DAOPessoaTXT;
import model.PersistenciaMySQL;
import model.PersistenciaTXT;

/**
 *
 * @author Dilean
 */
public class FabricaDAOPessoa implements FabricaDAO {

    private PersistenciaMySQL pessoaMySQL;
    private PersistenciaTXT pessoaTXT;

    @Override
    public PersistenciaTXT CriaDAOTxT() {
        if (pessoaTXT == null) {
            pessoaTXT = new DAOPessoaTXT();
        }
        return pessoaTXT;
    }

    @Override
    public PersistenciaMySQL CriaDAOMySQL() {
        if (pessoaMySQL == null) {
            pessoaMySQL = new DAOPessoaMySQL();
        }
        return pessoaMySQL;
    }

}
