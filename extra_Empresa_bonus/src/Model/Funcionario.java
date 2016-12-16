/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dilea
 */
public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salarioBase = 0.0;
    private double bonificacao = 0.0;
    private String CPF;
    private int tempoDeTrabalho = 0;
    private Map<String, Integer> faltasPeriodo;
    private List<Funcionario> subordinados;
    private boolean flagGerente = false;
    private String meta = "C";
    private int qtdBonusTdT = 0;

    public Funcionario() {
        this.subordinados = new ArrayList<>();
        this.faltasPeriodo = new HashMap<>();
    }
    
    public int getQtdBonusTdT() {
        return qtdBonusTdT;
    }

    public void addQtdBonusTdT() {
        this.qtdBonusTdT++;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public boolean isFlagGerente() {
        return flagGerente;
    }

    protected void setFlagGerente(boolean flagGerente) {
        this.flagGerente = flagGerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salarioBase;
    }

    public void setSalario(double salario) {
        this.salarioBase = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao += bonificacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(int tempoDeTrabalho) {
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public void addFalta(String periodo, int numFalta) {
        if (this.faltasPeriodo.containsKey(periodo)) {
            int falta = this.faltasPeriodo.get(periodo);
            this.faltasPeriodo.replace(periodo, falta, numFalta);
        }else{
            this.faltasPeriodo.put(periodo, numFalta);
        }
    }

    public void remFalta(String periodo, int numFalta) {
        if (this.faltasPeriodo.containsKey(periodo)) {
            int falta = this.faltasPeriodo.get(periodo);
            if (falta >= numFalta) {
                this.faltasPeriodo.replace(periodo, falta, falta - numFalta);
            }
        }
    }

    public int getFaltasPeriodo(String periodo) {
        int valor = this.faltasPeriodo.get(periodo);
        return valor;
    }

    public void addSubordinado(Funcionario f) {
        subordinados.add(f);
    }

    public void remSubordinado(Funcionario f) {
        subordinados.remove(f);
    }

    public boolean isSubordinado(String nome) {
        for (Funcionario f : subordinados) {
            if (f.nome.equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
