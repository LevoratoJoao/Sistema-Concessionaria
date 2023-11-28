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
    public void setTipo(String tipo);
    public void setMarca(String marca);
    public void setVeldeMax(Float velMax);
    public void setNumPortas(Integer numPortas);
    public String getTipo();
    public String getMarca();
    public Float getVeldeMax();
    public Integer getNumPortas();
}
