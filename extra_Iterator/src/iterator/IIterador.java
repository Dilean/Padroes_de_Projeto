/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import model.Pessoa;

/**
 *
 * @author Dilean
 */
public interface IIterador {
    public boolean HasNext();
    
    public Pessoa next();
    
    public Pessoa first();
    
    public Pessoa corrente();
}
