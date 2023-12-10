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
public class Concessionaria {

    private Fabricante fabricante;
    private ArrayList<Carro> carrosAVenda;
    private ArrayList<NotaFiscal> notasFiscais;

    public Concessionaria() {
        this.carrosAVenda = new ArrayList<>();
        this.fabricante = new Fabricante();
        this.notasFiscais = new ArrayList<>();
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void adicionarCarro(Carro carro) {
        this.carrosAVenda.add(carro);
    }

    public ArrayList<Carro> getCarrosAVenda() {
        return carrosAVenda;
    }

    public void venderCarro(NotaFiscal notaFiscal, Carro carro) {
        this.notasFiscais.add(notaFiscal);
        this.carrosAVenda.remove(carro);
    }

    public void removerCarro(Carro carro) {
        this.carrosAVenda.remove(carro);
    }

    public void editarCarro(Carro carro) {
        int i = this.carrosAVenda.indexOf(carro);
        this.carrosAVenda.add(i, carro);
    }

    public ArrayList<NotaFiscal> getNotasFiscais() {
        return notasFiscais;
    }
}
