/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.erikavinicius.apresentacao;

import br.com.erikavinicius.CryptographyTripleDES;
import br.com.erikavinicius.TrabalhoSeguranca;
import br.com.erikavinicius.dados.BancoDados;
import br.com.erikavinicius.dados.BancoDadosDepartamento;
import br.com.erikavinicius.dados.BancoDadosFuncionario;
import br.com.erikavinicius.entidade.Departamento;
import br.com.erikavinicius.entidade.Gerente;
import br.com.erikavinicius.entidade.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Erika
 */
public class EditaDepartamentoForm extends javax.swing.JFrame {

    private TrabalhoSeguranca trabalhoSeguranca;
    private BancoDadosFuncionario bancoDadosFuncionario;
    private BancoDadosDepartamento bancoDadosDepartamento;
    private String codigoDep;
    private String CPF_Atual;
    
    public EditaDepartamentoForm(TrabalhoSeguranca trabalhoSeguranca, String codigoDep, String CPFAtual) {
        initComponents();
    this.trabalhoSeguranca = trabalhoSeguranca;
    this.bancoDadosFuncionario = bancoDadosFuncionario;
    this.bancoDadosDepartamento = bancoDadosDepartamento;
    this.codigoDep = codigoDep;
    this.CPF_Atual = CPFAtual;
    this.configurarCmbGerente();
    this.preencher();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        cmbFuncionario = new javax.swing.JComboBox();
        lblGerente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edição de Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cmbFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });

        lblGerente.setText("Gerente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(txtNome)
                    .addComponent(cmbFuncionario, 0, 364, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNome)
                            .addComponent(lblGerente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGerente)
                .addGap(16, 16, 16)
                .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEditar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionarioActionPerformed
        
    }//GEN-LAST:event_cmbFuncionarioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Departamento depTemp = new Departamento();
        depTemp = (Departamento) this.cmbFuncionario.getSelectedItem();
                
        String nome = this.txtNome.getText().trim();
        String codigo = this.txtCodigo.getText().trim();
        String cpfGerente = depTemp.getGerente().getCpf();
         
        if(nome.isEmpty() || codigo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.WARNING_MESSAGE);    
        }else{
            try {
                this.bancoDadosDepartamento.EditaDepartamento(codigo, nome, cpfGerente, codigoDep);
            } catch (SQLException ex) {
                Logger.getLogger(EditaDepartamentoForm.class.getName()).log(Level.SEVERE, null, ex);
            }
           JOptionPane.showMessageDialog(this, "Departamento Editado com sucesso!", "Edição de Departamento", JOptionPane.INFORMATION_MESSAGE);
           limpar();
           this.dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void configurarCmbGerente() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.cmbFuncionario.getModel();
        model.removeAllElements();
        
        List<Usuario> listaTodos = null;
        Usuario user = null;
        try {
            user = this.bancoDadosFuncionario.ConsultaFuncionarioPorCPF(CPF_Atual);
        } catch (SQLException ex) {
            Logger.getLogger(EditaDepartamentoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listaTodos = this.bancoDadosFuncionario.ConsultaGerenteDisponivel();
            listaTodos.add(user);
        } catch (Exception e) {
        }
        
        for (Usuario gerente : listaTodos) {
            //if (gerente.getCargo().equals("GERENTE")) {
               model.addElement(gerente);
            //}
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
            java.util.logging.Logger.getLogger(EditaDepartamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaDepartamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaDepartamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaDepartamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
    }
    private void preencher() {

        Departamento depTemp = new Departamento();
        List<Departamento> listaDepartamento = null;
        try {
            listaDepartamento  = this.bancoDadosDepartamento.ConsultaTodosDepartamentos();
            //listaDepartamento = BancoDadosFuncionario.ConsultaGerentePorCPF(CPF_Atual);
        } catch (SQLException ex) {
            Logger.getLogger(EditaDepartamentoForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Departamento departamento : listaDepartamento) {
            if (departamento.getCodigo().equals(codigoDep)) {
               depTemp = departamento;
               break;
            }
        }
        cmbFuncionario.setSelectedItem(depTemp.getGerente().getNome());
        txtCodigo.setText(depTemp.getCodigo());        
        txtNome.setText(depTemp.getNome());
        
    }
    
    public void limpar(){
         this.txtNome.setText(null);   
         this.txtCodigo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cmbFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblGerente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
