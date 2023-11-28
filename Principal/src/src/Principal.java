/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

/**
 *
 * @author jvito
 */
public class Principal {

    public Principal() {
        Login login = new Login("adm", "12345");
        login = Login.iniciar();
        login.setVisible(true);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Principal();
    }
    
}
