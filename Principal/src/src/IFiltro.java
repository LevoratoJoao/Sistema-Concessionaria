/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author jvito
 */
public interface IFiltro {

    public Carro filtrarCarro(ArrayList<Carro> carros, String nome);
    public void filtrarEditarPrecoCarro(Carro carro, Float preco);
}
