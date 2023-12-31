/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import javax.swing.JOptionPane;

/**
 *
 * @author jvito
 */
public class MenuFabricante extends javax.swing.JFrame {

    public static MenuFabricante janela;

    /**
     * Creates new form MenuFabricante
     */
    public MenuFabricante() {
        initComponents();
    }
    
    public static MenuFabricante iniciar() {
        if (janela == null) {
            janela = new MenuFabricante();
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

        jLabel1 = new javax.swing.JLabel();
        btAddCarro = new javax.swing.JButton();
        btListCarro = new javax.swing.JButton();
        btEditCarro = new javax.swing.JButton();
        btRemoveCarro = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu da Fabricante");
        setLocation(new java.awt.Point(700, 300));

        jLabel1.setText("Menu Fabricante");

        btAddCarro.setText("Adicionar Carro");
        btAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCarroActionPerformed(evt);
            }
        });

        btListCarro.setText("Listar Carros");
        btListCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListCarroActionPerformed(evt);
            }
        });

        btEditCarro.setText("Editar Carro");
        btEditCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditCarroActionPerformed(evt);
            }
        });

        btRemoveCarro.setText("Remover Carro");
        btRemoveCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveCarroActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btVoltar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAddCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btListCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btEditCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btRemoveCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCarro)
                    .addComponent(btEditCarro))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListCarro)
                    .addComponent(btRemoveCarro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        janela = null;
        MenuConcessionaria menuConcessionaria = MenuConcessionaria.iniciar();
        setVisible(false);
        menuConcessionaria.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btAddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCarroActionPerformed
        MenuAddCarroDisponivel menuAddCarroDisponivel = MenuAddCarroDisponivel.iniciar();
        setVisible(false);
        menuAddCarroDisponivel.setVisible(true);
    }//GEN-LAST:event_btAddCarroActionPerformed

    private void btListCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListCarroActionPerformed
        MenuListarCarros menuListarCarros = MenuListarCarros.iniciar();
        menuListarCarros.listar(false);
        setVisible(false);
        menuListarCarros.setVisible(true);
    }//GEN-LAST:event_btListCarroActionPerformed

    private void btRemoveCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveCarroActionPerformed
        if (MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Fabricante não possui nenhum carro","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuRemoverCarro menuRemoverCarro = new MenuRemoverCarro();
            menuRemoverCarro.remover(false);
            setVisible(false);
            menuRemoverCarro.setVisible(true);
        }
    }//GEN-LAST:event_btRemoveCarroActionPerformed

    private void btEditCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditCarroActionPerformed
        if (MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Fabricante não possui carro","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuEditCarroFabricante menuEditCarroFabricante = new MenuEditCarroFabricante();
            setVisible(false);
            menuEditCarroFabricante.setVisible(true);
        }
    }//GEN-LAST:event_btEditCarroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFabricante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCarro;
    private javax.swing.JButton btEditCarro;
    private javax.swing.JButton btListCarro;
    private javax.swing.JButton btRemoveCarro;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
