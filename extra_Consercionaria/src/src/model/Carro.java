/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

/**
 *
 * @author dilea
 */
public abstract class Carro {

    private String nome;
    private String valor;
    private String marca;
    private String modelo;
    private String potencia;

    public void buzinar() {
        System.out.println("pon pon");
    }

    public Carro(String nome, String valor, String marca, String modelo, String potencia) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " - Marca: " + marca + " - Modelo: " + modelo);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
}
