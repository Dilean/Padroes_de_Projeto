/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Dilean
 */
public class CarroFiesta extends CarroPrototype {

    public CarroFiesta() {
        valor = "0.0";
    }

    public CarroFiesta(CarroPrototype carro) {
        valor = carro.getValor();
        nome = carro.getNome();
    }

    @Override
    public void imprimeInfo() {
        System.out.println("O carro " + getNome() + " está sendo vendodo por: " + getValor());
    }

    @Override
    public CarroPrototype clone() {
        return new CarroFiesta(this);
    }

}
