/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src;

/**
 *
 * @author jvito
 */
public interface ICarro {
    public void setNome(String nome);
    public void setTipo(String tipo);
    public void setMarca(String marca);
    public void setVelMax(Float velMax);
    public void setNumPortas(Integer numPortas);
    public String getNome();
    public String getTipo();
    public String getMarca();
    public Float getVelMax();
    public Integer getNumPortas();
}
