package br.edu.ifsul.cc.lpoo.estacionamentoifsul.view;

import br.edu.ifsul.cc.lpoo.estacionamentoifsul.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Modelo;
import model.Pessoa;
import model.TipoVeiculo;
import model.VeiOficial;
import model.Veiculo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author vanessalagomachado
 */
public class TelaCadastroVeiculo extends javax.swing.JDialog {

    private Veiculo veiculo;
    PersistenciaJPA jpa;

    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jpa = new PersistenciaJPA();
        pnlVeiOficial.setVisible(false);
        loadTipoVeiculo();
        loadPessoas();
        loadModelos();
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
        txtPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        ckbVeiOficial = new javax.swing.JCheckBox();
        pnlVeiOficial = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRenavan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoVeiculo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbPessoas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbModelos = new javax.swing.JComboBox<>();
        btnAddModelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Placa");

        jLabel2.setText("Cor");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        ckbVeiOficial.setText("Veículo Oficial");
        ckbVeiOficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVeiOficialActionPerformed(evt);
            }
        });

        jLabel3.setText("Chassi:");

        jLabel4.setText("Renavan:");

        javax.swing.GroupLayout pnlVeiOficialLayout = new javax.swing.GroupLayout(pnlVeiOficial);
        pnlVeiOficial.setLayout(pnlVeiOficialLayout);
        pnlVeiOficialLayout.setHorizontalGroup(
            pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVeiOficialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenavan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlVeiOficialLayout.setVerticalGroup(
            pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVeiOficialLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlVeiOficialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRenavan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel5.setText("Tipo:");

        jLabel6.setText("Proprietário:");

        jLabel7.setText("Modelo:");

        btnAddModelo.setText("+");
        btnAddModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlVeiOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPlaca)
                                        .addComponent(txtCor)
                                        .addComponent(cmbTipoVeiculo, 0, 188, Short.MAX_VALUE)
                                        .addComponent(cmbPessoas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAddModelo))))
                            .addComponent(ckbVeiOficial))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ckbVeiOficial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlVeiOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            // Inicializa veículo ou veículo oficial com os dados comuns
            Veiculo veiculoBase = createVeiculoBase();

            jpa.conexaoAberta();

            if (!ckbVeiOficial.isSelected()) {
                // Salva um veículo comum
                jpa.persist(veiculoBase);
            } else {
                // Cria um VeiOficial com dados adicionais e salva
                VeiOficial veiOficial = createVeiOficial((Veiculo) veiculoBase);
                jpa.persist(veiOficial);
            }

        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            jpa.fecharConexao();
            dispose();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ckbVeiOficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVeiOficialActionPerformed
        boolean ehOficial = ckbVeiOficial.isSelected();
        if (ehOficial == true) {
            pnlVeiOficial.setVisible(true);
        } else {
            pnlVeiOficial.setVisible(false);
        }

    }//GEN-LAST:event_ckbVeiOficialActionPerformed

    private void btnAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModeloActionPerformed
        TelaCadastroModelos telaModelo = new TelaCadastroModelos(null, rootPaneCheckingEnabled);
        telaModelo.setVisible(true);

        loadModelos();
    }//GEN-LAST:event_btnAddModeloActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroVeiculo dialog = new TelaCadastroVeiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void loadTipoVeiculo() {
        cmbTipoVeiculo.removeAllItems();
        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            cmbTipoVeiculo.addItem(tipo);
        }
    }

    public void loadPessoas() {
        cmbPessoas.removeAllItems();
        cmbPessoas.addItem(null);
        jpa.conexaoAberta();

        for (Pessoa p : jpa.getPessoas()) {
            cmbPessoas.addItem(p);
        }

        jpa.fecharConexao();
    }

    public void loadModelos() {
        cmbModelos.removeAllItems();
        cmbModelos.addItem(null);
        jpa.conexaoAberta();

        for (Modelo p : jpa.getModelos()) {
            cmbModelos.addItem(p);
        }

        jpa.fecharConexao();
    }

    private Veiculo createVeiculoBase() throws Exception {
        // Inicializa o veículo base com dados comuns
        Veiculo veiculoBase = (veiculo == null) ? new Veiculo() : veiculo;
        try {
            boolean desvinculacao = false;
            veiculoBase.setPlaca(txtPlaca.getText());
            veiculoBase.setCor(txtCor.getText());
            veiculoBase.setTipoVeiculo((TipoVeiculo) cmbTipoVeiculo.getSelectedItem());
            // Atualiza a Pessoa já vinculada, se existir
            if (veiculoBase.getProprietario() == null && (cmbPessoas.getSelectedItem() != null && veiculoBase.getProprietario() != cmbPessoas.getSelectedItem())) {
                veiculoBase.setProprietario((Pessoa) cmbPessoas.getSelectedItem());
            } else if (veiculoBase.getProprietario() != null && cmbPessoas.getSelectedItem() == null) {
                desvinculacao = true;
                veiculoBase.setProprietario(null);

            }

            if (veiculoBase.getModelo() == null && (cmbModelos.getSelectedItem() != null && cmbModelos.getSelectedItem() != veiculoBase.getModelo())) {
                veiculoBase.setModelo((Modelo) cmbModelos.getSelectedItem());
            } else if (veiculoBase.getModelo() != null && cmbModelos.getSelectedItem() == null) {
                desvinculacao = true;
                veiculoBase.setModelo(null);
            }

            if (desvinculacao) {
                jpa.conexaoAberta();
                jpa.persist(veiculoBase);
                jpa.fecharConexao();
            }
        } catch (Exception e) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return veiculoBase;
        }
    }

    private VeiOficial createVeiOficial(Veiculo veiculoBase) throws Exception {
        VeiOficial veiOficial = (veiculoBase instanceof VeiOficial) ? (VeiOficial) veiculoBase : new VeiOficial();

        try {
            boolean desvinculacao = false;

            // Dados comuns herdados do Veiculo base
            veiOficial.setPlaca(veiculoBase.getPlaca());
            veiOficial.setCor(veiculoBase.getCor());
            veiOficial.setTipoVeiculo(veiculoBase.getTipoVeiculo());

            // Verifica e atualiza o proprietário
            if (veiOficial.getProprietario() == null && cmbPessoas.getSelectedItem() != null) {
                veiOficial.setProprietario((Pessoa) cmbPessoas.getSelectedItem());
            } else if (veiOficial.getProprietario() != null && cmbPessoas.getSelectedItem() == null) {
                desvinculacao = true;
                veiOficial.setProprietario(null);
            } else if (veiOficial.getProprietario() != null && veiOficial.getProprietario() != cmbPessoas.getSelectedItem()) {
                veiOficial.setProprietario((Pessoa) cmbPessoas.getSelectedItem());
            }

            // Verifica e atualiza o modelo
            if (veiOficial.getModelo() == null && cmbModelos.getSelectedItem() != null) {
                veiOficial.setModelo((Modelo) cmbModelos.getSelectedItem());
            } else if (veiOficial.getModelo() != null && cmbModelos.getSelectedItem() == null) {
                desvinculacao = true;
                veiOficial.setModelo(null);
            } else if (veiOficial.getModelo() != null && veiOficial.getModelo() != cmbModelos.getSelectedItem()) {
                veiOficial.setModelo((Modelo) cmbModelos.getSelectedItem());
            }

            // Adiciona os campos específicos de VeiOficial
            veiOficial.setChassi(txtChassi.getText());
            veiOficial.setRenavan(txtRenavan.getText());

            // Persistir alterações no banco, se necessário
            if (desvinculacao) {
                jpa.conexaoAberta();
                jpa.persist(veiOficial);
                jpa.fecharConexao();
            }

        } catch (Exception e) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return veiOficial;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddModelo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckbVeiOficial;
    private javax.swing.JComboBox<Modelo> cmbModelos;
    private javax.swing.JComboBox<Pessoa> cmbPessoas;
    private javax.swing.JComboBox<TipoVeiculo> cmbTipoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlVeiOficial;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRenavan;
    // End of variables declaration//GEN-END:variables

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;

//        Lógica de Negócio: uma vez criado um veículo oficial ou um veículo o tipo dele não poderá ser alterado
        ckbVeiOficial.setVisible(false);

        txtCor.setText(veiculo.getCor());
        txtPlaca.setText(veiculo.getPlaca());
        cmbTipoVeiculo.setSelectedItem(veiculo.getTipoVeiculo());
        cmbPessoas.setSelectedItem(veiculo.getProprietario());
        cmbModelos.setSelectedItem(veiculo.getModelo());

        if (veiculo instanceof VeiOficial) {
            ckbVeiOficial.setSelected(true);
            pnlVeiOficial.setVisible(true);
            VeiOficial vei = (VeiOficial) veiculo;
            txtChassi.setText(vei.getChassi());
            txtRenavan.setText(vei.getRenavan());

        }
    }
}
