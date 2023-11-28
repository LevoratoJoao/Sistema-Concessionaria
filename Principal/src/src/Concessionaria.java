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
    
    public class NotaFiscal {
        private Cliente cliente;
        private Carro carro;

        public NotaFiscal(Cliente cliente, Carro carro) {
            this.cliente = cliente;
            this.carro = carro;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Carro getCarro() {
            return carro;
        }

        public void setCarro(Carro carro) {
            this.carro = carro;
        }
    }
    
    private ArrayList<Cliente> clientes;
    private Fabricante fabricante;
    private ArrayList<Carro> carrosAVenda;
    private ArrayList<NotaFiscal> notasFiscais;

    public Concessionaria() {
        this.clientes = new ArrayList<>();
        this.carrosAVenda = new ArrayList<>();
        this.fabricante = new Fabricante();
        this.notasFiscais = new ArrayList<>();
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public void adicionarCarro(Carro carro) {
        if (fabricante.getCarrosDisponiveis().contains(carro)) {
            this.carrosAVenda.add(carro);
        } else {
            System.out.println("O carro não está disponível na lista de carros da fabricante.");
        }
    }

    public ArrayList<Carro> getCarrosAVenda() {
        return carrosAVenda;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public boolean verificarCliente(Cliente cliente) {
        return this.clientes.contains(cliente);
    }
    
    public void venderCarro(Cliente cliente, Carro carro) {
        if (verificarCliente(cliente) == true) {
            notasFiscais.add(new NotaFiscal(cliente, carro));
            this.carrosAVenda.remove(carro);
        }
    }
    
    public void editarCarro(Carro carro) {
        int i = this.carrosAVenda.indexOf(carro);
        this.carrosAVenda.add(i, carro);
    }
    
    public ArrayList<NotaFiscal> getNotasFiscais() {
        return notasFiscais;
    }
    
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
