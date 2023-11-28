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
public class Fabricante {
    private ArrayList<Carro> carrosDisponiveis;

    public Fabricante() {
        carrosDisponiveis = new ArrayList<>();
    }
    
    public void adicionarCarro(Carro carro) {
        this.carrosDisponiveis.add(carro);
    }
    
    public void removerCarro(Carro carro) {
        this.carrosDisponiveis.remove(carro);
    }
    
    public void editarCarro(Carro carro) {
        int i = this.carrosDisponiveis.indexOf(carro);
        this.carrosDisponiveis.add(i, carro);
    }

    public ArrayList<Carro> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }
    
}
