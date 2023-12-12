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
public class MenuAddCarroVenda extends javax.swing.JFrame {

    public static MenuAddCarroVenda janela;
    
    /**
     * Creates new form MenuAddCarroVenda
     */
    public MenuAddCarroVenda() {
        initComponents();
    }
    
    public static MenuAddCarroVenda iniciar() {
        if (janela == null) {
            janela = new MenuAddCarroVenda();
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

        lbCarrosDisponiveis = new javax.swing.JLabel();
        cbCarrosDisponiveis = new javax.swing.JComboBox<>();
        lbPreco = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar Carro a Venda");
        setLocation(new java.awt.Point(700, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCarrosDisponiveis.setText("Carros disponiveis pela fabricante");

        lbPreco.setText("Preco");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbCarrosDisponiveis)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbPreco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btAdicionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addComponent(cbCarrosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarrosDisponiveis)
                    .addComponent(cbCarrosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btAdicionar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
        for (Carro carroDisponivel : carrosDisponiveis) {
            cbCarrosDisponiveis.addItem(carroDisponivel.getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    public class MinhaExcecao extends Exception {
        public MinhaExcecao(String message){
            super(message);
        }
    }
    
    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            String nomeCarro = String.valueOf(cbCarrosDisponiveis.getSelectedItem());
            ArrayList<Carro> carrosDisponiveis = MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis();
            Carro carroDisponivel = new Filtrar().filtrarCarro(carrosDisponiveis, nomeCarro);
            
            /**
             * Percorro a lista de carros disponiveis procurando qual tem nome igual ao escolhido, quando achar insere na lista de vendas
             * Pego o indice e o nome da classe do carro naquele indice para acessar e mudar seu preco
             */
            
            int i = carrosDisponiveis.indexOf(carroDisponivel);
            Carro carro = carrosDisponiveis.get(i);
            Carro novoCarro;
            switch (carro.getClass().getSimpleName()) {
                case "CarroHatch":
                    CarroHatch carroHatch = (CarroHatch) carro;
                    if (Float.parseFloat(tfPreco.getText()) <  carroHatch.getPreco()) {
                        throw new MinhaExcecao("Erro: preco menor que o sugerido pela fabricante");
                    }   
                    novoCarro = new CarroHatch(carro.getMarca(), carro.getNome(), carro.getVelMax(), carro.getNumPortas(), Float.parseFloat(tfPreco.getText()));
                    MenuConcessionaria.concessionaria.adicionarCarro(novoCarro);
                    break;
                case "CarroSeda":
                    CarroSeda carroSeda = (CarroSeda) carro;
                    if (Float.parseFloat(tfPreco.getText()) <  carroSeda.getPreco()) {
                        throw new MinhaExcecao("Erro: preco menor que o sugerido pela fabricante");
                    }
                    novoCarro = new CarroSeda(carro.getMarca(), carro.getNome(), carro.getVelMax(), carro.getNumPortas(), Float.parseFloat(tfPreco.getText()));
                    MenuConcessionaria.concessionaria.adicionarCarro(novoCarro);
                    break;
                default:
                    throw new Exception();
            }
            JOptionPane.showMessageDialog(null, "Carro adicionado","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            MenuConcessionaria menuConcessionaria = MenuConcessionaria.iniciar();
            limparCampos();
            setVisible(false);
            menuConcessionaria.setVisible(true);
        } catch (MinhaExcecao e) {
            JOptionPane.showMessageDialog(null,"" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar adicionar carro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        limparCampos();
        MenuConcessionaria menuConcessionaria = MenuConcessionaria.iniciar();
        setVisible(false);
        menuConcessionaria.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    public void limparCampos(){
        janela = null;
        tfPreco.setText("");
        cbCarrosDisponiveis.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(MenuAddCarroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAddCarroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAddCarroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAddCarroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAddCarroVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCarrosDisponiveis;
    private javax.swing.JLabel lbCarrosDisponiveis;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
