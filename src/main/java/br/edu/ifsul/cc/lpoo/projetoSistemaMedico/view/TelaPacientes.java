/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetoSistemaMedico.view;

import br.edu.ifsul.cc.lpoo.projetoSistemaMedico.dao.PersistenciaJPA;
import javax.swing.DefaultListModel;
import javax.swing.*;
import Modelos.*;
/**
 *
 * @author Jennifer Ebertz
 */
public class TelaPacientes extends javax.swing.JFrame {

    PersistenciaJPA jpa;
    /**
     * Creates new form TelaPacientes
     */
    public TelaPacientes() {
        initComponents();
        
        jpa = new PersistenciaJPA();
        carregarPacientesCadastrados();
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
        lstPessoas = new javax.swing.JList<>();
        btnNovaPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnRemoverPessoa = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblBuscaNome = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        btnNovoPaciente = new javax.swing.JButton();
        btnEditarPaciente = new javax.swing.JButton();
        btnRemoverPaciente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPacientes = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();

        jScrollPane1.setViewportView(lstPessoas);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitulo.setText("Pacientes Cadastrados");

        lblBuscaNome.setText("Nome: ");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        btnNovoPaciente.setText("Novo");
        btnNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPacienteActionPerformed(evt);
            }
        });

        btnEditarPaciente.setText("Editar");
        btnEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacienteActionPerformed(evt);
            }
        });

        btnRemoverPaciente.setText("Remover");
        btnRemoverPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPacienteActionPerformed(evt);
            }
        });

        lstPacientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstPacientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(lstPacientes);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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
                        .addComponent(lblBuscaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoPaciente)
                    .addComponent(btnEditarPaciente)
                    .addComponent(btnRemoverPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed

    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed

    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    private void btnRemoverPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPessoaActionPerformed

    }//GEN-LAST:event_btnRemoverPessoaActionPerformed

    private void btnEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacienteActionPerformed
        Pacientes pacienteSel = lstPacientes.getSelectedValue();
        if (pacienteSel != null) {
            TelaCadastroPacientes telaEdt = new TelaCadastroPacientes(this, rootPaneCheckingEnabled);
            telaEdt.setPaciente(pacienteSel);
            telaEdt.setVisible(true);

            carregarPacientesCadastrados();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para Editar");
        }
    }//GEN-LAST:event_btnEditarPacienteActionPerformed

    private void btnNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPacienteActionPerformed
        TelaCadastroPacientes telaCadastro
        = new TelaCadastroPacientes(this, rootPaneCheckingEnabled);
        telaCadastro.setVisible(true);

        carregarPacientesCadastrados();
    }//GEN-LAST:event_btnNovoPacienteActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        if(txtBuscaNome.getText().trim().isEmpty()){
            carregarPacientesCadastrados();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
            modeloLista.addAll(jpa.getPacientes(txtBuscaNome.getText().trim()));
            System.out.println("Pacientes carregados: "+jpa.getPacientes(txtBuscaNome.getText().trim()));
            lstPacientes.setModel(modeloLista);

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyReleased

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed

    }//GEN-LAST:event_txtBuscaNomeKeyPressed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void lstPacientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstPacientesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPacientesAncestorAdded

    private void btnRemoverPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPacienteActionPerformed
        Pacientes pacienteSel = lstPacientes.getSelectedValue();
        if (pacienteSel != null) {
            System.out.println("Pessoa: " + pacienteSel.getId());
            try {
                jpa.conexaoAberta();

                int delOp = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja remover " + pacienteSel.getNome() + "?");
                if (delOp == JOptionPane.YES_OPTION) {
                    jpa.remover(pacienteSel);
                }

                jpa.fecharConexao();
                carregarPacientesCadastrados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao remover paciente " + pacienteSel + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para remover");
        }
    }//GEN-LAST:event_btnRemoverPacienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPacientes().setVisible(true);
            }
        });
    }
    public void carregarPacientesCadastrados(){
        jpa.conexaoAberta();
        
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getPacientes());
        lstPacientes.setModel(modeloLista);
        
        jpa.fecharConexao();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPaciente;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnNovoPaciente;
    private javax.swing.JButton btnRemoverPaciente;
    private javax.swing.JButton btnRemoverPessoa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Pacientes> lstPacientes;
    private javax.swing.JList<Pessoa> lstPessoas;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables

    private static class Pessoa {

        public Pessoa() {
        }
    }

}
