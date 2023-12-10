/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvito
 */
public class MenuListarCarros extends javax.swing.JFrame {

    public static MenuListarCarros janela;
    private Boolean pagina; // True - concessionaria || False - Farbicante
    /**
     * Creates new form MenuListarCarros
     */
    public MenuListarCarros() {
        initComponents();
    }
    
    public static MenuListarCarros iniciar() {
        if (janela == null) {
            janela = new MenuListarCarros();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarros = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carros Disponiveis");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Marca", "Tipo", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCarros);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    public void voltar() {
        janela = null;
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
    
    public void listar(Boolean pagina) {
        this.pagina = pagina;
        if (pagina == true) {
            listarTabelaConcessionaria();
        } else {
            listarTabelaFabricante();
        }
    }
    
    public void listarTabelaFabricante() {
        try{
            DefaultTableModel model =(DefaultTableModel) tbCarros.getModel();
            model.setNumRows(0);
            for(Carro carroDisponivel : MenuConcessionaria.concessionaria.getFabricante().getCarrosDisponiveis()) {
                if (carroDisponivel.getTipo().equals("Hatch") == true) {
                    CarroHatch carro = (CarroHatch) carroDisponivel;
                    model.addRow(new Object[] 
                    { 
                        carro.getNome(), 
                        carro.getMarca(), 
                        carro.getTipo(),
                        carro.getPreco()
                    }); 
                } else if (carroDisponivel.getTipo().equals("Seda") == true) {
                    CarroSeda carro = (CarroSeda) carroDisponivel;
                    model.addRow(new Object[] 
                    { 
                        carro.getNome(), 
                        carro.getMarca(), 
                        carro.getTipo(),
                        carro.getPreco()
                    }); 
                } else {
                    throw new Exception();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: não foi possivel listar os carros.","",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void listarTabelaConcessionaria() {
        try{
            DefaultTableModel model =(DefaultTableModel) tbCarros.getModel();
            model.setNumRows(0);
            for(Carro carroDisponivel : MenuConcessionaria.concessionaria.getCarrosAVenda()) {
                if (carroDisponivel.getTipo().equals("Hatch") == true) {
                    CarroHatch carro = (CarroHatch) carroDisponivel;
                    model.addRow(new Object[] 
                    { 
                        carro.getNome(), 
                        carro.getMarca(), 
                        carro.getTipo(),
                        carro.getPreco()
                    }); 
                } else if (carroDisponivel.getTipo().equals("Seda") == true) {
                    CarroSeda carro = (CarroSeda) carroDisponivel;
                    model.addRow(new Object[] 
                    { 
                        carro.getNome(), 
                        carro.getMarca(), 
                        carro.getTipo(),
                        carro.getPreco()
                    }); 
                } else {
                    JOptionPane.showMessageDialog(null,"Erro ao tentar listar carros", "Erro", JOptionPane.ERROR_MESSAGE);
                    throw new Exception();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: não foi possivel listar os carros.","",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(MenuListarCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuListarCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuListarCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListarCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListarCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCarros;
    // End of variables declaration//GEN-END:variables
}
