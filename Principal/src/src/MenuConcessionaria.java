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
public class MenuConcessionaria extends javax.swing.JFrame {

    public static MenuConcessionaria janela;

    public static Concessionaria concessionaria = new Concessionaria();;
    /**
     * Creates new form Concessionaria
     */
    public MenuConcessionaria() {
        initComponents();
    }
    
    public static MenuConcessionaria iniciar() {
        if (janela == null) {
            janela = new MenuConcessionaria();
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

        lbMenuConcessionaria = new javax.swing.JLabel();
        btAddCarro = new javax.swing.JButton();
        btEditCarro = new javax.swing.JButton();
        btRemoveCarro = new javax.swing.JButton();
        btListarCarros = new javax.swing.JButton();
        lbVendaCarros = new javax.swing.JLabel();
        lbVendas = new javax.swing.JLabel();
        btListarVendas = new javax.swing.JButton();
        btVenderCarro = new javax.swing.JButton();
        btMenuFabricante = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu da Concessionaria");
        setLocation(new java.awt.Point(700, 300));

        lbMenuConcessionaria.setText("Menu Concessionaria");

        btAddCarro.setText("Adicionar Carro");
        btAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCarroActionPerformed(evt);
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

        btListarCarros.setText("Listar Carros");
        btListarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCarrosActionPerformed(evt);
            }
        });

        lbVendaCarros.setText("Venda de carros");

        lbVendas.setText("Vendas");

        btListarVendas.setText("Listar Vendas");
        btListarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarVendasActionPerformed(evt);
            }
        });

        btVenderCarro.setText("Vender Carro");
        btVenderCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderCarroActionPerformed(evt);
            }
        });

        btMenuFabricante.setText("Menu Fabricante");
        btMenuFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuFabricanteActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbVendaCarros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMenuFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btListarCarros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRemoveCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEditCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAddCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btListarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(btVenderCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbVendas)
                        .addGap(136, 136, 136))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lbMenuConcessionaria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbMenuConcessionaria)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVendaCarros)
                    .addComponent(lbVendas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCarro)
                    .addComponent(btListarVendas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditCarro)
                    .addComponent(btVenderCarro))
                .addGap(15, 15, 15)
                .addComponent(btRemoveCarro)
                .addGap(18, 18, 18)
                .addComponent(btListarCarros)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMenuFabricante)
                    .addComponent(btSair))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditCarroActionPerformed
        if (concessionaria.getFabricante().getCarrosDisponiveis().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Concessionaria não possui carro","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuEditCarroConcessionaria menuEditCarroConcessionaria = MenuEditCarroConcessionaria.iniciar();
            setVisible(false);
            menuEditCarroConcessionaria.setVisible(true);
        }
    }//GEN-LAST:event_btEditCarroActionPerformed

    private void btMenuFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuFabricanteActionPerformed
        MenuFabricante menuFabricante = MenuFabricante.iniciar();
        setVisible(false);
        menuFabricante.setVisible(true);
    }//GEN-LAST:event_btMenuFabricanteActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btAddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCarroActionPerformed
        if (concessionaria.getFabricante().getCarrosDisponiveis().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Concessionaria não possui nenhum carro","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuAddCarroVenda menuAddCarro = MenuAddCarroVenda.iniciar();
            setVisible(false);
            menuAddCarro.setVisible(true);
        }
    }//GEN-LAST:event_btAddCarroActionPerformed

    private void btListarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCarrosActionPerformed
        MenuListarCarros menuListarCarros = MenuListarCarros.iniciar();
        menuListarCarros.listar(true);
        setVisible(false);
        menuListarCarros.setVisible(true);
    }//GEN-LAST:event_btListarCarrosActionPerformed

    private void btListarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarVendasActionPerformed
        MenuListarVendas menuListarVendas = MenuListarVendas.iniciar();
        menuListarVendas.carregarVendas();
        setVisible(false);
        menuListarVendas.setVisible(true);
    }//GEN-LAST:event_btListarVendasActionPerformed

    private void btVenderCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderCarroActionPerformed
        if (concessionaria.getCarrosAVenda().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Concessionaria não possui nenhum carro a venda","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuVenderCarro menuVenderCarro = new MenuVenderCarro();
            setVisible(false);
            menuVenderCarro.setVisible(true);
        }
    }//GEN-LAST:event_btVenderCarroActionPerformed

    private void btRemoveCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveCarroActionPerformed
        if (concessionaria.getFabricante().getCarrosDisponiveis().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Concessionaria não possui nenhum carro","Erro",JOptionPane.WARNING_MESSAGE);
        } else {
            MenuRemoverCarro menuRemoverCarro = MenuRemoverCarro.iniciar();
            menuRemoverCarro.remover(true);
            setVisible(false);
            menuRemoverCarro.setVisible(true);
        }
    }//GEN-LAST:event_btRemoveCarroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConcessionaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConcessionaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConcessionaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConcessionaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConcessionaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCarro;
    private javax.swing.JButton btEditCarro;
    private javax.swing.JButton btListarCarros;
    private javax.swing.JButton btListarVendas;
    private javax.swing.JButton btMenuFabricante;
    private javax.swing.JButton btRemoveCarro;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenderCarro;
    private javax.swing.JLabel lbMenuConcessionaria;
    private javax.swing.JLabel lbVendaCarros;
    private javax.swing.JLabel lbVendas;
    // End of variables declaration//GEN-END:variables
}
