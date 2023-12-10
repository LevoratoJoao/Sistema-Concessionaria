/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author jvito
 */
public class Filtrar implements IFiltro {

    @Override
    public Carro filtrarCarro(ArrayList<Carro> carros, String nome) {
        for (Carro carro : carros) {
            if (carro.getNome().equalsIgnoreCase(nome)) {
                return carro;
            }
        }
        return null;
    }

    @Override
    public void filtrarEditarPrecoCarro(Carro carro, Float preco) {
        if (carro.getClass().getSimpleName().equals("CarroHatch") == true) {
            CarroHatch carroHatch = (CarroHatch) carro;
            carroHatch.setPreco(preco);
        } else if (carro.getClass().getSimpleName().equals("CarroSeda") == true) {
            CarroSeda carroSeda = (CarroSeda) carro;
            carroSeda.setPreco(preco);
        }
    }
    
}
