/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jvito
 */
public class MenuRemoverCarro extends javax.swing.JFrame {

    public static MenuRemoverCarro janela;
    private Boolean pagina; // True - concessionaria || False - Farbicante
    
    /**
     * Creates new form MenuRemoverCarro
     */
    public MenuRemoverCarro() {
        initComponents();
    }
    
    public static MenuRemoverCarro iniciar() {
        if (janela == null) {
            janela = new MenuRemoverCarro();
        }
        return janela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbCarros = new javax.swing.JComboBox<>();
        btRemover = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        lbCarro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remover carro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lbCarro.setText("Carro:");

        jLabel1.setText("Remover carro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCarro)
                        .addGap(18, 18, 18)
                        .addComponent(cbCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCarro))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btVoltar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        removerCarroAtivado();
    }//GEN-LAST:event_btRemoverActionPerformed

    public void removerCarroConcessionaria() {
        try {
            String nomeCarro = String.valueOf(cbCarros.getSelectedItem());
            ArrayList<Carro> carrosVenda = MenuConcessionaria.concessionaria.getCarrosAVenda();
            for (Carro carroVenda : carrosVenda) {
                if (carroVenda.getNome().equalsIgnoreCase(nomeCarro)){
                    MenuConcessionaria.concessionaria.removerCarro(carroVenda);
                    JOptionPane.showMessageDialog(null, "Carro removido","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                    janela = null;
                    MenuConcessionaria menuConcessionaria = MenuConcessionaria.iniciar();
                    setVisible(false);
                    menuConcessionaria.setVisible(true);
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar remover carro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removerCarroFabricante() {
        try {
            String nomeCarro = String.valueOf(cbCarros.getSelectedItem());
            ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
            for (Carro carroDisponivel : carrosDisponiveis) {
                if (carroDisponivel.getNome().equalsIgnoreCase(nomeCarro)){
                    MenuConcessionaria.concessionaria.getFabricante().removerCarro(carroDisponivel);
                    JOptionPane.showMessageDialog(null, "Carro removido","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                    janela = null;
                    MenuFabricante menuFabricante = MenuFabricante.iniciar();
                    setVisible(false);
                    menuFabricante.setVisible(true);
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar remover carro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removerCarroAtivado() {
        if (pagina == true) {
            removerCarroConcessionaria();
        } else {
            removerCarroFabricante();
        }
    }
    
    public void voltar() {
        if (this.pagina == true) {
            MenuConcessionaria menuConcessionaria = MenuConcessionaria.iniciar();
            setVisible(false);
            menuConcessionaria.setVisible(true);
        } else {
            MenuFabricante menuFabricante = MenuFabricante.iniciar();
            setVisible(false);
            menuFabricante.setVisible(true);
        }
    }
    
    public void remover(Boolean pagina) {
        this.pagina = pagina;
        if (pagina == true) {
            carregarCarroConcessionaria();
        } else {
            carregarCarroFabricante();
        }
    }
    
    public void carregarCarroConcessionaria() {
        ArrayList<Carro> carrosVenda = MenuConcessionaria.concessionaria.getCarrosAVenda();
        for (Carro carro : carrosVenda) {
            cbCarros.addItem(carro.getNome());
        }
    }
    
    public void carregarCarroFabricante() {
        ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
        for (Carro carroDisponivel : carrosDisponiveis) {
            cbCarros.addItem(carroDisponivel.getNome());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRemoverCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCarros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCarro;
    // End of variables declaration//GEN-END:variables
}
