/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author kevin
 */
public class tela_cadastro_pet extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro_pet
     */
    public tela_cadastro_pet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nome_funcionario = new javax.swing.JLabel();
        label_CPF = new javax.swing.JLabel();
        field_nome_funcionario = new javax.swing.JTextField();
        field_telefone = new javax.swing.JTextField();
        label_telefone = new javax.swing.JLabel();
        label_servico_prestado = new javax.swing.JLabel();
        field_servico_prestado = new javax.swing.JTextField();
        label_cep = new javax.swing.JLabel();
        field_cep = new javax.swing.JTextField();
        label_numero = new javax.swing.JLabel();
        field_numero = new javax.swing.JTextField();
        label_rua = new javax.swing.JLabel();
        field_rua = new javax.swing.JTextField();
        label_bairro = new javax.swing.JLabel();
        field_bairro = new javax.swing.JTextField();
        label_cidade = new javax.swing.JLabel();
        field_cidade = new javax.swing.JTextField();
        field_CPF = new javax.swing.JTextField();
        button_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_nome_funcionario.setText("Nome do funcionário:");
        getContentPane().add(label_nome_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 213, -1, -1));

        label_CPF.setText("CPF:");
        getContentPane().add(label_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 313, -1, -1));

        field_nome_funcionario.setPreferredSize(new java.awt.Dimension(653, 60));
        field_nome_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_funcionarioActionPerformed(evt);
            }
        });
        getContentPane().add(field_nome_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 235, -1, -1));

        field_telefone.setPreferredSize(new java.awt.Dimension(300, 60));
        getContentPane().add(field_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 335, -1, -1));

        label_telefone.setText("Telefone:");
        getContentPane().add(label_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 313, -1, -1));

        label_servico_prestado.setText("Serviço prestado:");
        getContentPane().add(label_servico_prestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 413, -1, -1));

        field_servico_prestado.setPreferredSize(new java.awt.Dimension(300, 60));
        getContentPane().add(field_servico_prestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 435, -1, -1));

        label_cep.setText("CEP:");
        getContentPane().add(label_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 413, -1, -1));

        field_cep.setPreferredSize(new java.awt.Dimension(200, 60));
        getContentPane().add(field_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 435, -1, -1));

        label_numero.setText("N°:");
        getContentPane().add(label_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1117, 413, -1, -1));

        field_numero.setPreferredSize(new java.awt.Dimension(100, 60));
        field_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_numeroActionPerformed(evt);
            }
        });
        getContentPane().add(field_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1117, 435, -1, -1));

        label_rua.setText("Rua:");
        getContentPane().add(label_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 513, -1, -1));

        field_rua.setPreferredSize(new java.awt.Dimension(653, 60));
        field_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ruaActionPerformed(evt);
            }
        });
        getContentPane().add(field_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 535, -1, -1));

        label_bairro.setText("Bairro:");
        getContentPane().add(label_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 613, -1, -1));

        field_bairro.setPreferredSize(new java.awt.Dimension(320, 60));
        field_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_bairroActionPerformed(evt);
            }
        });
        getContentPane().add(field_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 635, -1, -1));

        label_cidade.setText("Cidade:");
        getContentPane().add(label_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 613, -1, -1));

        field_cidade.setPreferredSize(new java.awt.Dimension(300, 60));
        getContentPane().add(field_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 635, -1, -1));

        field_CPF.setPreferredSize(new java.awt.Dimension(320, 60));
        field_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_CPFActionPerformed(evt);
            }
        });
        getContentPane().add(field_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 335, -1, -1));

        button_cadastrar.setText("Cadastrar");
        button_cadastrar.setPreferredSize(new java.awt.Dimension(300, 40));
        button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(button_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 726, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_nome_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_funcionarioActionPerformed

    private void field_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_numeroActionPerformed

    private void field_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_ruaActionPerformed

    private void field_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_bairroActionPerformed

    private void field_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_CPFActionPerformed

    private void button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastro_pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_pet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro_pet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cadastrar;
    private javax.swing.JTextField field_CPF;
    private javax.swing.JTextField field_bairro;
    private javax.swing.JTextField field_cep;
    private javax.swing.JTextField field_cidade;
    private javax.swing.JTextField field_nome_funcionario;
    private javax.swing.JTextField field_numero;
    private javax.swing.JTextField field_rua;
    private javax.swing.JTextField field_servico_prestado;
    private javax.swing.JTextField field_telefone;
    private javax.swing.JLabel label_CPF;
    private javax.swing.JLabel label_bairro;
    private javax.swing.JLabel label_cep;
    private javax.swing.JLabel label_cidade;
    private javax.swing.JLabel label_nome_funcionario;
    private javax.swing.JLabel label_numero;
    private javax.swing.JLabel label_rua;
    private javax.swing.JLabel label_servico_prestado;
    private javax.swing.JLabel label_telefone;
    // End of variables declaration//GEN-END:variables
}
