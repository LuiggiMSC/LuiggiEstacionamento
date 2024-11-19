package br.edu.ifsul.cc.lpoo.estacionamentoifsul.view;

import br.edu.ifsul.cc.lpoo.estacionamentoifsul.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.VinculoPessoa;

public class TelaPessoa extends javax.swing.JFrame {

    PersistenciaJPA jpa;

    public TelaPessoa() {
        initComponents();

        jpa = new PersistenciaJPA();
        carregarPessoasCadastradas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        areaFiltros = new javax.swing.JPanel();
        lblBuscaNome = new javax.swing.JLabel();
        cmbVinculoPessoa = new javax.swing.JComboBox<>();
        lblBuscaVinculo = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPessoas = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovaPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnRemoverPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitulo.setText("Pessoas Cadastradas");

        lblBuscaNome.setText("Nome: ");

        cmbVinculoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(VinculoPessoa.values()));
        cmbVinculoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVinculoPessoaActionPerformed(evt);
            }
        });

        lblBuscaVinculo.setText("Vínculo:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout areaFiltrosLayout = new javax.swing.GroupLayout(areaFiltros);
        areaFiltros.setLayout(areaFiltrosLayout);
        areaFiltrosLayout.setHorizontalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaFiltrosLayout.createSequentialGroup()
                .addComponent(lblBuscaNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBuscaVinculo)
                .addGap(18, 18, 18)
                .addComponent(cmbVinculoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        areaFiltrosLayout.setVerticalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaFiltrosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(cmbVinculoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscaVinculo))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(lstPessoas);

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnNovaPessoa.setText("Novo");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        btnEditarPessoa.setText("Editar");
        btnEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPessoaActionPerformed(evt);
            }
        });

        btnRemoverPessoa.setText("Remover");
        btnRemoverPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNovaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPessoa)
                    .addComponent(btnEditarPessoa)
                    .addComponent(btnRemoverPessoa))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed
        TelaCadastroPessoa telaCadastro
                = new TelaCadastroPessoa(this, rootPaneCheckingEnabled);
        telaCadastro.setVisible(true);

        carregarPessoasCadastradas();

    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        String termo = txtBuscaNome.getText();
        VinculoPessoa vinculoSelecionado = (VinculoPessoa) cmbVinculoPessoa.getSelectedItem();
        buscarPessoas(termo, vinculoSelecionado);
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed
        Pessoa selectedPessoa = lstPessoas.getSelectedValue();
        if (selectedPessoa != null) {
            TelaCadastroPessoa telaCadastro = new TelaCadastroPessoa(this, rootPaneCheckingEnabled, selectedPessoa);
            telaCadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para editar.");
        }
    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    private void btnRemoverPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPessoaActionPerformed
        Pessoa selectedPessoa = lstPessoas.getSelectedValue();
        if (selectedPessoa != null) {
            int confirmation = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover esta pessoa?");
            if (confirmation == JOptionPane.YES_OPTION) {
                jpa.conexaoAberta();
                try {
                    jpa.remover(selectedPessoa);
                } catch (Exception ex) {
                    Logger.getLogger(TelaPessoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                jpa.fecharConexao();
                carregarPessoasCadastradas();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para remover.");
        }
    }//GEN-LAST:event_btnRemoverPessoaActionPerformed

    private void cmbVinculoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVinculoPessoaActionPerformed
        String termo = txtBuscaNome.getText();
        VinculoPessoa vinculoSelecionado = (VinculoPessoa) cmbVinculoPessoa.getSelectedItem();
        buscarPessoas(termo, vinculoSelecionado);
    }//GEN-LAST:event_cmbVinculoPessoaActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        String termo = txtBuscaNome.getText();
        VinculoPessoa vinculoSelecionado = (VinculoPessoa) cmbVinculoPessoa.getSelectedItem();
        buscarPessoas(termo, vinculoSelecionado);
    }//GEN-LAST:event_txtBuscaNomeKeyReleased


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoa().setVisible(true);
            }
        });
    }

    public void carregarPessoasCadastradas() {
        jpa.conexaoAberta();

        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getPessoas());
        lstPessoas.setModel(modeloLista);

        jpa.fecharConexao();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaFiltros;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnRemoverPessoa;
    private javax.swing.JComboBox<VinculoPessoa> cmbVinculoPessoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblBuscaVinculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Pessoa> lstPessoas;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables

    public void buscarPessoas(String termo, VinculoPessoa vinculoSelecionado) {
        jpa.conexaoAberta();

        DefaultListModel modeloLista = new DefaultListModel();

        for (Pessoa pessoa : jpa.getPessoas()) {
            boolean nomeCerto = pessoa.getNome().toLowerCase().contains(termo.toLowerCase());
            boolean vinculoCerto = (vinculoSelecionado == null) || pessoa.getVinculoPessoa() == vinculoSelecionado;

            if (nomeCerto && vinculoCerto) {
                modeloLista.addElement(pessoa);
            }

            lstPessoas.setModel(modeloLista);
            jpa.fecharConexao();
        }
    }

    
    
    /*
    private void buscarPessoasPorVinculo(VinculoPessoa vinculoSelecionado) {
        jpa.conexaoAberta();

        DefaultListModel modeloLista = new DefaultListModel();

        for (Pessoa pessoa : jpa.getPessoas()) {
            if (pessoa.getVinculoPessoa() == vinculoSelecionado) {
                modeloLista.addElement(pessoa);
            }
        }
        lstPessoas.setModel(modeloLista);
        jpa.fecharConexao();
    }
   */
}
