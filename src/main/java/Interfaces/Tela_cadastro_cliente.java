/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author c.nunes
 */
public class Tela_cadastro_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Interface_cliente
     */
    public Tela_cadastro_cliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtf_campo_nome_cliente = new javax.swing.JTextField();
        jlbl_nome_cliente = new javax.swing.JLabel();
        jtxtf_campo_cpf = new javax.swing.JTextField();
        jlbl_cpf = new javax.swing.JLabel();
        jtxtf_campo_telefone = new javax.swing.JTextField();
        jlbl_telefone = new javax.swing.JLabel();
        jtxtf_campo_servico = new javax.swing.JTextField();
        jlbl_servico_contratado = new javax.swing.JLabel();
        jtxtf_campo_cep = new javax.swing.JTextField();
        jlbl_cep = new javax.swing.JLabel();
        jtxtf_campo_num = new javax.swing.JTextField();
        jlbl_rua = new javax.swing.JLabel();
        jtxtf_campo_rua = new javax.swing.JTextField();
        jlbl_bairro = new javax.swing.JLabel();
        jtxtf_campo_bairro = new javax.swing.JTextField();
        jtxtf_campo_cidade = new javax.swing.JTextField();
        jlbl_cidade = new javax.swing.JLabel();
        jlbl_titulo = new javax.swing.JLabel();
        jlbl_num = new javax.swing.JLabel();
        jbtn_Cadastrar_cliente = new javax.swing.JButton();
        jlbl_background_cadastro_cliente = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 768));
        setPreferredSize(new java.awt.Dimension(1320, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jtxtf_campo_nome_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jtxtf_campo_nome_cliente.setCaretColor(new java.awt.Color(255, 255, 255));

        jlbl_nome_cliente.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_nome_cliente.setText("Nome completo do cliente:");

        jlbl_cpf.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cpf.setText("CPF:");

        jtxtf_campo_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_campo_telefoneActionPerformed(evt);
            }
        });

        jlbl_telefone.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_telefone.setText("Telefone:");

        jlbl_servico_contratado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_servico_contratado.setText("Serviço contratado:");

        jlbl_cep.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cep.setText("CEP:");

        jlbl_rua.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_rua.setText("Rua:");

        jlbl_bairro.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_bairro.setText("Bairro:");

        jtxtf_campo_cidade.setPreferredSize(new java.awt.Dimension(300, 60));

        jlbl_cidade.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cidade.setText("Cidade:");

        jlbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_titulo.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_titulo.setText("Cadastro de Cliente");

        jlbl_num.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_num.setText("N°");

        jbtn_Cadastrar_cliente.setBackground(new java.awt.Color(51, 153, 0));
        jbtn_Cadastrar_cliente.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        jbtn_Cadastrar_cliente.setText("CADASTRAR");
        jbtn_Cadastrar_cliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtf_campo_nome_cliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtf_campo_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_cpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbl_telefone)
                            .addComponent(jtxtf_campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtf_campo_cep)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlbl_cep)
                                        .addGap(192, 192, 192)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_num)
                                    .addComponent(jtxtf_campo_num, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jtxtf_campo_rua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtf_campo_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jtxtf_campo_cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbl_bairro)
                                .addGap(338, 338, 338)
                                .addComponent(jlbl_cidade))
                            .addComponent(jlbl_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtf_campo_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_servico_contratado)
                            .addComponent(jlbl_rua))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jbtn_Cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlbl_titulo)
                .addGap(32, 32, 32)
                .addComponent(jlbl_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtf_campo_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_telefone)
                    .addComponent(jlbl_cpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtf_campo_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_servico_contratado)
                    .addComponent(jlbl_cep)
                    .addComponent(jlbl_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtf_campo_num, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtf_campo_servico)
                    .addComponent(jtxtf_campo_cep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbl_rua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtf_campo_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_bairro)
                    .addComponent(jlbl_cidade))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtf_campo_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtxtf_campo_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jbtn_Cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 47, 750, 590));

        jlbl_background_cadastro_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        getContentPane().add(jlbl_background_cadastro_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -150, 1920, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtf_campo_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_campo_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_campo_telefoneActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_cadastro_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_Cadastrar_cliente;
    private javax.swing.JLabel jlbl_background_cadastro_cliente;
    private javax.swing.JLabel jlbl_bairro;
    private javax.swing.JLabel jlbl_cep;
    private javax.swing.JLabel jlbl_cidade;
    private javax.swing.JLabel jlbl_cpf;
    private javax.swing.JLabel jlbl_nome_cliente;
    private javax.swing.JLabel jlbl_num;
    private javax.swing.JLabel jlbl_rua;
    private javax.swing.JLabel jlbl_servico_contratado;
    private javax.swing.JLabel jlbl_telefone;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JTextField jtxtf_campo_bairro;
    private javax.swing.JTextField jtxtf_campo_cep;
    private javax.swing.JTextField jtxtf_campo_cidade;
    private javax.swing.JTextField jtxtf_campo_cpf;
    private javax.swing.JTextField jtxtf_campo_nome_cliente;
    private javax.swing.JTextField jtxtf_campo_num;
    private javax.swing.JTextField jtxtf_campo_rua;
    private javax.swing.JTextField jtxtf_campo_servico;
    private javax.swing.JTextField jtxtf_campo_telefone;
    // End of variables declaration//GEN-END:variables
}
