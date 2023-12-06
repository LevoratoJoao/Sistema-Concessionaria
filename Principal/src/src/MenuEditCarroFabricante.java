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
public class MenuEditCarroFabricante extends javax.swing.JFrame {

    public static MenuEditCarroFabricante janela;

    /**
     * Creates new form MenuEditCarroFabricante
     */
    public MenuEditCarroFabricante() {
        initComponents();
    }

    public static MenuEditCarroFabricante iniciar() {
        if (janela == null) {
            janela = new MenuEditCarroFabricante();
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

        lbSelecionar = new javax.swing.JLabel();
        cbCarros = new javax.swing.JComboBox<>();
        lbMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        lbNome1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbVelMax = new javax.swing.JLabel();
        tfVelMax = new javax.swing.JTextField();
        lbNumPortas = new javax.swing.JLabel();
        cbNumPortas = new javax.swing.JComboBox<>();
        lbPreco = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Carro Fabricante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbSelecionar.setText("Selecione o carro");

        lbMarca.setText("Marca");

        lbNome1.setText("Nome");

        lbVelMax.setText("Vel. Maxima");

        lbNumPortas.setText("Num. Portas");

        cbNumPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        lbPreco.setText("Preco");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btCancel1.setText("Cancelar");
        btCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumPortas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome1)
                        .addGap(98, 98, 98)
                        .addComponent(tfNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMarca)
                        .addGap(98, 98, 98)
                        .addComponent(tfMarca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSelecionar)
                        .addGap(109, 109, 109)
                        .addComponent(cbCarros, 0, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVelMax)
                        .addGap(88, 88, 88)
                        .addComponent(tfVelMax))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPreco)
                        .addGap(123, 123, 123)
                        .addComponent(tfPreco)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelecionar)
                    .addComponent(cbCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfVelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumPortas)
                    .addComponent(cbNumPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditar)
                    .addComponent(btCancel1))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class MinhaExcecao extends Exception {
        public MinhaExcecao(String message) {
            super(message);
        }
    }

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try {
            String nomeCarro = String.valueOf(cbCarros.getSelectedItem());
            ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
            if (Float.parseFloat(tfPreco.getText()) < 0 || Float.parseFloat(tfVelMax.getText()) < 0) {
                throw new MinhaExcecao("Erro: valor numerico invalido");
            }
            for (Carro carroDisponivel : carrosDisponiveis) {
                if (carroDisponivel.getNome().equalsIgnoreCase(nomeCarro)) {
                    carroDisponivel.setMarca(tfMarca.getText());
                    carroDisponivel.setNome(tfNome.getText());
                    carroDisponivel.setVelMax(Float.parseFloat(tfVelMax.getText()));
                    carroDisponivel.setNumPortas(Integer.parseInt(String.valueOf(cbNumPortas.getSelectedItem())));
                    if (carroDisponivel.getClass().getSimpleName().equals("CarroHatch") == true) {
                        CarroHatch carroHatch = (CarroHatch) carroDisponivel;
                        carroHatch.setPreco(Float.parseFloat(tfPreco.getText()));
                    } else if (carroDisponivel.getClass().getSimpleName().equals("CarroSeda") == true) {
                        CarroSeda carroSeda = (CarroSeda) carroDisponivel;
                        carroSeda.setPreco(Float.parseFloat(tfPreco.getText()));
                    } else {
                        throw new Exception("Erro.");
                    }
                    JOptionPane.showMessageDialog(null, "Carro editado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    MenuFabricante menuFabricante = MenuFabricante.iniciar();
                    setVisible(false);
                    menuFabricante.setVisible(true);
                }
            }
        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null, ""+ e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar carro", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancel1ActionPerformed
        limparCampos();
        MenuFabricante menuFabricante = MenuFabricante.iniciar();
        setVisible(false);
        menuFabricante.setVisible(true);
    }//GEN-LAST:event_btCancel1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
        for (Carro carroDisponivel : carrosDisponiveis) {
            cbCarros.addItem(carroDisponivel.getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    public void limparCampos() {
        janela = null;
        tfNome.setText("");
        tfPreco.setText("");
        tfVelMax.setText("");
        tfMarca.setText("");
        cbNumPortas.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(MenuEditCarroFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEditCarroFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEditCarroFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEditCarroFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEditCarroFabricante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel1;
    private javax.swing.JButton btEditar;
    private javax.swing.JComboBox<String> cbCarros;
    private javax.swing.JComboBox<String> cbNumPortas;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbNumPortas;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbSelecionar;
    private javax.swing.JLabel lbVelMax;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfVelMax;
    // End of variables declaration//GEN-END:variables
}
