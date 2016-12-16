/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.DAO;

/**
 *
 * @author dilea
 */
public abstract class TextoDAO {
    protected String conexao;
    
    public TextoDAO(){
        this.conexao = "coneção com o banco";
    }
    
    public abstract boolean persistir(String t);
    
    public abstract String getTexto(String t);
    
    public abstract boolean findTexto(String t);
        
}
