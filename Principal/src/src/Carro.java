/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author jvito
 */
public class Carro implements ICarro {
    private String tipo;
    private String marca;
    private String nome;
    private Float velMax;
    private Integer numPortas;

    public Carro(String tipo, String marca, String nome, Float velMax, Integer numPortas) {
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.velMax = velMax;
        this.numPortas = numPortas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getVelMax() {
        return velMax;
    }

    public void setVelMax(Float velMax) {
        this.velMax = velMax;
    }
    

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setVeldeMax(Float velMax) {
        this.velMax = velMax;
    }

    @Override
    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public Float getVeldeMax() {
        return velMax;
    }

    @Override
    public Integer getNumPortas() {
        return numPortas;
    }
    
}
