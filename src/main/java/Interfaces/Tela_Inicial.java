/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author d.rodrigues
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
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

        jPanel_menu = new javax.swing.JPanel();
        btn_Home = new javax.swing.JToggleButton();
        btn_agenda = new javax.swing.JButton();
        btn_financeiro = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_funcionarios = new javax.swing.JButton();
        btn_pets = new javax.swing.JButton();
        btn_config = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jPanel_Menu_layout = new javax.swing.JPanel();
        jPanel_PainelFuncinarios = new javax.swing.JPanel();
        jPanel_PainelAgenda = new javax.swing.JPanel();
        jPanel_PainelFinanceiro = new javax.swing.JPanel();
        jPanel_PainelListaPet = new javax.swing.JPanel();
        jPanel_PainelConfig = new javax.swing.JPanel();
        jPanel_ExitButton = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel_BGpadrao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_menu.setBackground(new java.awt.Color(124, 115, 101));
        jPanel_menu.setForeground(new java.awt.Color(124, 115, 101));
        jPanel_menu.setFont(new java.awt.Font("Merriweather", 0, 12)); // NOI18N
        jPanel_menu.setMinimumSize(new java.awt.Dimension(205, 768));
        jPanel_menu.setPreferredSize(new java.awt.Dimension(205, 768));
        jPanel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home.setBackground(new java.awt.Color(124, 115, 101));
        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_PetAgendaMenor.png"))); // NOI18N
        btn_Home.setBorder(null);
        btn_Home.setBorderPainted(false);
        btn_Home.setContentAreaFilled(false);
        btn_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Home.setFocusPainted(false);
        btn_Home.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_PetAgendaPressed.png"))); // NOI18N
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_HomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_HomeMouseReleased(evt);
            }
        });
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        jPanel_menu.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 193, -1));

        btn_agenda.setBackground(new java.awt.Color(124, 115, 101));
        btn_agenda.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_agenda.setForeground(new java.awt.Color(255, 255, 255));
        btn_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_agenda.png"))); // NOI18N
        btn_agenda.setText("Agenda");
        btn_agenda.setBorder(null);
        btn_agenda.setBorderPainted(false);
        btn_agenda.setContentAreaFilled(false);
        btn_agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agenda.setFocusPainted(false);
        btn_agenda.setHideActionText(true);
        btn_agenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_agenda.setIconTextGap(8);
        btn_agenda.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_agenda.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_agenda.setPreferredSize(new java.awt.Dimension(205, 60));
        btn_agenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_agendaMouseMoved(evt);
            }
        });
        btn_agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agendaMousePressed(evt);
            }
        });
        btn_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendaActionPerformed(evt);
            }
        });
        jPanel_menu.add(btn_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, -1, -1));

        btn_financeiro.setBackground(new java.awt.Color(124, 115, 101));
        btn_financeiro.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_financeiro.setForeground(new java.awt.Color(255, 255, 255));
        btn_financeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_financeiro.png"))); // NOI18N
        btn_financeiro.setText("Financeiro");
        btn_financeiro.setBorder(null);
        btn_financeiro.setContentAreaFilled(false);
        btn_financeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_financeiro.setHideActionText(true);
        btn_financeiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_financeiro.setIconTextGap(8);
        btn_financeiro.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_financeiro.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_financeiro.setPreferredSize(new java.awt.Dimension(205, 60));
        btn_financeiro.setSelected(true);
        jPanel_menu.add(btn_financeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, -1, -1));

        btn_clientes.setBackground(new java.awt.Color(124, 115, 101));
        btn_clientes.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_clientes.png"))); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.setBorder(null);
        btn_clientes.setContentAreaFilled(false);
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.setHideActionText(true);
        btn_clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_clientes.setIconTextGap(8);
        btn_clientes.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_clientes.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_clientes.setPreferredSize(new java.awt.Dimension(205, 60));
        jPanel_menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 368, -1, -1));

        btn_funcionarios.setBackground(new java.awt.Color(124, 115, 101));
        btn_funcionarios.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_funcionario.png"))); // NOI18N
        btn_funcionarios.setText("Funcionários");
        btn_funcionarios.setBorder(null);
        btn_funcionarios.setContentAreaFilled(false);
        btn_funcionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_funcionarios.setHideActionText(true);
        btn_funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_funcionarios.setIconTextGap(8);
        btn_funcionarios.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_funcionarios.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_funcionarios.setPreferredSize(new java.awt.Dimension(205, 60));
        jPanel_menu.add(btn_funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 428, -1, -1));

        btn_pets.setBackground(new java.awt.Color(124, 115, 101));
        btn_pets.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_pets.setForeground(new java.awt.Color(255, 255, 255));
        btn_pets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pets.png"))); // NOI18N
        btn_pets.setText("Pets");
        btn_pets.setBorder(null);
        btn_pets.setContentAreaFilled(false);
        btn_pets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pets.setHideActionText(true);
        btn_pets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pets.setIconTextGap(8);
        btn_pets.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_pets.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_pets.setPreferredSize(new java.awt.Dimension(205, 60));
        jPanel_menu.add(btn_pets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, -1, -1));

        btn_config.setBackground(new java.awt.Color(124, 115, 101));
        btn_config.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_config.setForeground(new java.awt.Color(255, 255, 255));
        btn_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_configuracoes.png"))); // NOI18N
        btn_config.setText("Configurações");
        btn_config.setBorder(null);
        btn_config.setContentAreaFilled(false);
        btn_config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_config.setHideActionText(true);
        btn_config.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_config.setIconTextGap(8);
        btn_config.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_config.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_config.setPreferredSize(new java.awt.Dimension(205, 60));
        jPanel_menu.add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 548, -1, -1));

        btn_sair.setBackground(new java.awt.Color(124, 115, 101));
        btn_sair.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_sair.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.setBorder(null);
        btn_sair.setContentAreaFilled(false);
        btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sair.setHideActionText(true);
        btn_sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_sair.setIconTextGap(8);
        btn_sair.setMaximumSize(new java.awt.Dimension(205, 50));
        btn_sair.setMinimumSize(new java.awt.Dimension(205, 50));
        btn_sair.setPreferredSize(new java.awt.Dimension(205, 60));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        jPanel_menu.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 608, -1, -1));

        getContentPane().add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 768));

        jPanel_Menu_layout.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Menu_layout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel_Menu_layout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel_PainelFuncinariosLayout = new javax.swing.GroupLayout(jPanel_PainelFuncinarios);
        jPanel_PainelFuncinarios.setLayout(jPanel_PainelFuncinariosLayout);
        jPanel_PainelFuncinariosLayout.setHorizontalGroup(
            jPanel_PainelFuncinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel_PainelFuncinariosLayout.setVerticalGroup(
            jPanel_PainelFuncinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_PainelFuncinarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 51, -1, -1));

        javax.swing.GroupLayout jPanel_PainelAgendaLayout = new javax.swing.GroupLayout(jPanel_PainelAgenda);
        jPanel_PainelAgenda.setLayout(jPanel_PainelAgendaLayout);
        jPanel_PainelAgendaLayout.setHorizontalGroup(
            jPanel_PainelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel_PainelAgendaLayout.setVerticalGroup(
            jPanel_PainelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_PainelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 51, -1, -1));

        javax.swing.GroupLayout jPanel_PainelFinanceiroLayout = new javax.swing.GroupLayout(jPanel_PainelFinanceiro);
        jPanel_PainelFinanceiro.setLayout(jPanel_PainelFinanceiroLayout);
        jPanel_PainelFinanceiroLayout.setHorizontalGroup(
            jPanel_PainelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_PainelFinanceiroLayout.setVerticalGroup(
            jPanel_PainelFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_PainelFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 267, 117, -1));

        javax.swing.GroupLayout jPanel_PainelListaPetLayout = new javax.swing.GroupLayout(jPanel_PainelListaPet);
        jPanel_PainelListaPet.setLayout(jPanel_PainelListaPetLayout);
        jPanel_PainelListaPetLayout.setHorizontalGroup(
            jPanel_PainelListaPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_PainelListaPetLayout.setVerticalGroup(
            jPanel_PainelListaPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_PainelListaPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 267, 117, -1));

        javax.swing.GroupLayout jPanel_PainelConfigLayout = new javax.swing.GroupLayout(jPanel_PainelConfig);
        jPanel_PainelConfig.setLayout(jPanel_PainelConfigLayout);
        jPanel_PainelConfigLayout.setHorizontalGroup(
            jPanel_PainelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_PainelConfigLayout.setVerticalGroup(
            jPanel_PainelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_PainelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 267, 117, -1));

        javax.swing.GroupLayout jPanel_ExitButtonLayout = new javax.swing.GroupLayout(jPanel_ExitButton);
        jPanel_ExitButton.setLayout(jPanel_ExitButtonLayout);
        jPanel_ExitButtonLayout.setHorizontalGroup(
            jPanel_ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );
        jPanel_ExitButtonLayout.setVerticalGroup(
            jPanel_ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel_Menu_layout.add(jPanel_ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(124, 115, 101));
        jButton1.setForeground(new java.awt.Color(124, 115, 101));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_clientes.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_Menu_layout.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 51, 117, 100));

        getContentPane().add(jPanel_Menu_layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 125, 664, 448));

        jLabel_BGpadrao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        getContentPane().add(jLabel_BGpadrao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_HomeMousePressed

    private void btn_HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_HomeMouseReleased

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_agendaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agendaMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_agendaMouseMoved

    private void btn_agendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agendaMousePressed
        // TODO add your handling code here:
        btn_agenda.setBackground(new java.awt.Color(99, 90, 77));
        
    }//GEN-LAST:event_btn_agendaMousePressed

    private void btn_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendaActionPerformed
        // TODO add your handling code here:
        Tela_de_visualizacao_do_mes telaVisualizaMes = new Tela_de_visualizacao_do_mes();
        telaVisualizaMes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agendaActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        TELA_LOGIN telaLogin = new TELA_LOGIN();
        telaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Home;
    private javax.swing.JButton btn_agenda;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_config;
    private javax.swing.JButton btn_financeiro;
    private javax.swing.JButton btn_funcionarios;
    private javax.swing.JButton btn_pets;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_BGpadrao;
    private javax.swing.JPanel jPanel_ExitButton;
    private javax.swing.JPanel jPanel_Menu_layout;
    private javax.swing.JPanel jPanel_PainelAgenda;
    private javax.swing.JPanel jPanel_PainelConfig;
    private javax.swing.JPanel jPanel_PainelFinanceiro;
    private javax.swing.JPanel jPanel_PainelFuncinarios;
    private javax.swing.JPanel jPanel_PainelListaPet;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}