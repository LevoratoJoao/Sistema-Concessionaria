/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author jvito
 */
public class CarroHatch extends Carro {
    
    private Float preco;
    public CarroHatch(String marca, String nome, Float velMax, Integer numPortas, Float preco) {
        super("Hatch", marca, nome, velMax, numPortas);
        this.preco = preco;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
