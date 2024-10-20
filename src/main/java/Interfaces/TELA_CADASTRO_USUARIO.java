/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import ui.custom.RoundedCornerButtonUI;

/**
 *
 * @author ncunha
 */
public class TELA_CADASTRO_USUARIO extends javax.swing.JFrame {

    /**
     * Creates new form TELA_CADASTRO_USUARIO
     */
    public TELA_CADASTRO_USUARIO() {
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

        jPanel1 = new javax.swing.JPanel();
        jlbl_cadastrarUsuario = new javax.swing.JLabel();
        jlbl_nome = new javax.swing.JLabel();
        jtxt_CPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxt_senha = new javax.swing.JTextField();
        jbtn_CadastrarUsuario = new javax.swing.JButton();
        jlbl_background_cadastro_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Merriweather", 0, 12)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(557, 569));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 569));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_cadastrarUsuario.setFont(new java.awt.Font("Merriweather", 0, 36)); // NOI18N
        jlbl_cadastrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cadastrarUsuario.setText("Cadastrar usuário");
        jPanel1.add(jlbl_cadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 318, 36));

        jlbl_nome.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_nome.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_nome.setText("Nome:");
        jPanel1.add(jlbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 76, -1, -1));

        jtxt_CPF.setBackground(new java.awt.Color(217, 217, 217));
        jtxt_CPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jtxt_CPF.setMinimumSize(new java.awt.Dimension(464, 42));
        jtxt_CPF.setPreferredSize(new java.awt.Dimension(464, 42));
        jtxt_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_CPFActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 184, 550, 50));

        jLabel1.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CPF (Será utilizado como Login):");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 165, -1, -1));

        jtxt_nome.setBackground(new java.awt.Color(217, 217, 217));
        jtxt_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jtxt_nome.setMinimumSize(new java.awt.Dimension(464, 42));
        jtxt_nome.setPreferredSize(new java.awt.Dimension(464, 42));
        jtxt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 550, 50));

        jLabel2.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SENHA (8 dígitos, incluindo números e caracteres especiais):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 251, -1, -1));

        jtxt_senha.setBackground(new java.awt.Color(217, 217, 217));
        jtxt_senha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jtxt_senha.setMinimumSize(new java.awt.Dimension(464, 42));
        jtxt_senha.setPreferredSize(new java.awt.Dimension(464, 42));
        jtxt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_senhaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 273, 550, 50));

        jbtn_CadastrarUsuario.setBackground(new java.awt.Color(71, 120, 63));
        jbtn_CadastrarUsuario.setFont(new java.awt.Font("Merriweather", 0, 20)); // NOI18N
        jbtn_CadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_CadastrarUsuario.setText("CADASTRAR");
        jbtn_CadastrarUsuario.setBorder(null);
        jbtn_CadastrarUsuario.setMaximumSize(new java.awt.Dimension(170, 35));
        jbtn_CadastrarUsuario.setMinimumSize(new java.awt.Dimension(170, 35));
        jbtn_CadastrarUsuario.setPreferredSize(new java.awt.Dimension(170, 35));
        jbtn_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_CadastrarUsuarioActionPerformed(evt);
            }
        });
        jbtn_CadastrarUsuario.setUI(new RoundedCornerButtonUI());
        jPanel1.add(jbtn_CadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 368, 240, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 120, 643, 451));

        jlbl_background_cadastro_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        jlbl_background_cadastro_usuario.setLabelFor(jlbl_background_cadastro_usuario);
        jlbl_background_cadastro_usuario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        getContentPane().add(jlbl_background_cadastro_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_CPFActionPerformed

    private void jtxt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nomeActionPerformed

    private void jtxt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_senhaActionPerformed

    private void jbtn_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_CadastrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_CadastrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TELA_CADASTRO_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_CADASTRO_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_CADASTRO_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_CADASTRO_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_CADASTRO_USUARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_CadastrarUsuario;
    private javax.swing.JLabel jlbl_background_cadastro_usuario;
    private javax.swing.JLabel jlbl_cadastrarUsuario;
    private javax.swing.JLabel jlbl_nome;
    private javax.swing.JTextField jtxt_CPF;
    private javax.swing.JTextField jtxt_nome;
    private javax.swing.JTextField jtxt_senha;
    // End of variables declaration//GEN-END:variables
}
