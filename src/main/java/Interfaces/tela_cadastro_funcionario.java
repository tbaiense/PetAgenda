/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.mycompany.petagenda.MenuPanel;
import java.util.Arrays;
import javax.swing.JOptionPane;
import petagenda.Usuario;
import petagenda.bd.BD;
import petagenda.dados.Endereco;
import petagenda.dados.LocalAtuacao;
import petagenda.exception.*;
import petagenda.servico.Servico;
import ui.custom.RoundedCornerBorder;
import ui.custom.RoundedCornerButtonUI;

/**
 *
 * @author kevin
 */
public class tela_cadastro_funcionario extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro_funcionario
     */
    public tela_cadastro_funcionario() {
        // Validação de login
        if (Usuario.getAtual() != null) {
            initComponents();
            initMenuPanel();
            Servico[] servicosCadastrados = BD.Servico.selectAll();
            if (servicosCadastrados != null) {
                for (Servico s : servicosCadastrados) {
                    jcbox_Selecao_servico.addItem(s);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Serviço disponível recebido do banco de dados.");
            }

            setFieldsInfo(BD.Usuario.selectLast()); // Recebe o último Usuario do banco e preenche os campos com ele
        } else {
            JOptionPane.showMessageDialog(null, "É necessário estar logado para acessar esta funcionalidade.");
            super.dispose();
            System.exit(0);
        }
    }

    // Define as informações dos campos usando um objeto do tipo petagenda.Usuario
    private void setFieldsInfo(Usuario usuario) {
        if (usuario != null) {
            field_nome_funcionario.setText(usuario.getNome());
            field_cpf.setText(usuario.getCpf().toString());
            field_telefone.setText(usuario.getTelefone());
            Servico servUsuario = usuario.getServico();
            for (int i=0; i < jcbox_Selecao_servico.getItemCount(); i++) {
                Servico servCBox = (Servico)jcbox_Selecao_servico.getItemAt(i);
                if (servCBox.equals(servUsuario)) {
                    jcbox_Selecao_servico.setSelectedIndex(i);
                }
            }
            field_cep.setText(usuario.getEndereco().CEP);
            field_numero.setText(usuario.getEndereco().NUMERO);
            field_rua.setText(usuario.getEndereco().RUA);
            field_bairro.setText(usuario.getEndereco().BAIRRO);
            field_cidade.setText(usuario.getEndereco().CIDADE);
        }
    }
    
    // Limpa as informações dos campos de Usuario
    private void clearFieldsInfo() {
        field_nome_funcionario.setText(null);
        field_cpf.setText(null);
        field_telefone.setText(null);
        jcbox_Selecao_servico.setSelectedIndex(0);
        field_cep.setText(null);
        field_numero.setText(null);
        field_rua.setText(null);
        field_bairro.setText(null);
        field_cidade.setText(null);
    }
    
    // Recebe as informações dos campos em um novo objeto do tipo petagenda.Usuario
    private Usuario getFieldsInfo() {
        Usuario novoUsuario = null;
        String nome, cpf, telefone, cep, numero, rua, bairro, cidade;
        Servico servicoPresta;
        
        nome = field_nome_funcionario.getText();
        cpf = field_cpf.getText();
        telefone = field_telefone.getText();
        servicoPresta = (Servico)jcbox_Selecao_servico.getSelectedItem();
        cep = field_cep.getText();
        numero = field_numero.getText();
        rua = field_rua.getText();
        bairro = field_bairro.getText();
        cidade = field_cidade.getText();
        
        IllegalArgumentsException exsCadastro = new IllegalArgumentsException();
        // Criação do objeto do endereco;
        Endereco endereco = null;
        try {
            endereco = new Endereco(rua, numero, bairro, cidade, cep);
        } catch (IllegalArgumentsException exs) {
            exsCadastro.addCause(exs.getCauses());
        }
        
        LocalAtuacao localAtuacao = null;
        try {
            localAtuacao = LocalAtuacao.valueOf(endereco);
        } catch (NullPointerException ex) {
//            exsCadastro.addCause(ex);
        }
        
        // Criação do usuário
        try {
            novoUsuario = new Usuario(nome, endereco, cpf, telefone, servicoPresta, localAtuacao);
        } catch (IllegalArgumentsException exs) {
            exsCadastro.addCause(exs.getCauses());
        }
            
        if (exsCadastro.size() > 0) {
            Throwable[] todasCauses = exsCadastro.getCauses();
            Arrays.sort(todasCauses); // Ordena as mensagens de exceção usando order_index das exceções
            
            StringBuilder erros = new StringBuilder();
            for (Throwable c : todasCauses) {
                if (c != null && !(c instanceof IllegalLocalAtuacaoException) && !(c instanceof IllegalEnderecoException)) {
                    erros.append(c.getMessage());
                    erros.append("\n");
                }
            }
            
            JOptionPane.showMessageDialog(null, erros.toString(), "Campos inválidos", JOptionPane.ERROR_MESSAGE);
        }
        
        return novoUsuario;
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
        jPanel1 = new javax.swing.JPanel();
        lbl_cadastrarFuncinario = new javax.swing.JLabel();
        jlbl_nome_funcionario = new javax.swing.JLabel();
        field_nome_funcionario = new javax.swing.JTextField();
        jlbl_cpf = new javax.swing.JLabel();
        field_cpf = new javax.swing.JTextField();
        jlbl_telefone = new javax.swing.JLabel();
        field_telefone = new javax.swing.JTextField();
        jlbl_servico_prestado = new javax.swing.JLabel();
        jcbox_Selecao_servico = new javax.swing.JComboBox<>();
        jlbl_cep = new javax.swing.JLabel();
        field_cep = new javax.swing.JTextField();
        jlbl_numero = new javax.swing.JLabel();
        field_numero = new javax.swing.JTextField();
        jlbl_rua = new javax.swing.JLabel();
        field_rua = new javax.swing.JTextField();
        jlbl_bairro = new javax.swing.JLabel();
        field_bairro = new javax.swing.JTextField();
        jlbl_cidade = new javax.swing.JLabel();
        field_cidade = new javax.swing.JTextField();
        jbtn_cadastrarFuncionario = new javax.swing.JButton();
        jlbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_menu.setBackground(new java.awt.Color(124, 115, 101));
        jPanel_menu.setForeground(new java.awt.Color(124, 115, 101));
        jPanel_menu.setFont(new java.awt.Font("Merriweather", 0, 12)); // NOI18N
        jPanel_menu.setMinimumSize(new java.awt.Dimension(205, 768));
        jPanel_menu.setPreferredSize(new java.awt.Dimension(205, 768));
        jPanel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(670, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cadastrarFuncinario.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_cadastrarFuncinario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cadastrarFuncinario.setText("Cadastrar funcionário");
        lbl_cadastrarFuncinario.setPreferredSize(new java.awt.Dimension(486, 45));
        jPanel1.add(lbl_cadastrarFuncinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 20, -1, -1));

        jlbl_nome_funcionario.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_nome_funcionario.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_nome_funcionario.setText("Nome do funcionário:");
        jlbl_nome_funcionario.setPreferredSize(new java.awt.Dimension(165, 20));
        jPanel1.add(jlbl_nome_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 85, -1, 20));

        field_nome_funcionario.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_funcionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_nome_funcionario.setMinimumSize(new java.awt.Dimension(550, 50));
        field_nome_funcionario.setPreferredSize(new java.awt.Dimension(550, 50));
        field_nome_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_funcionarioActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, -1, -1));

        jlbl_cpf.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cpf.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cpf.setText("CPF:");
        jPanel1.add(jlbl_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 174, -1, -1));

        field_cpf.setBackground(new java.awt.Color(217, 217, 217));

        field_cpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_cpf.setMinimumSize(new java.awt.Dimension(250, 50));
        field_cpf.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel1.add(field_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 193, -1, -1));

        jlbl_telefone.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_telefone.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone.setText("Telefone:");
        jlbl_telefone.setMaximumSize(new java.awt.Dimension(71, 20));
        jlbl_telefone.setMinimumSize(new java.awt.Dimension(71, 20));
        jlbl_telefone.setPreferredSize(new java.awt.Dimension(71, 20));
        jPanel1.add(jlbl_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 174, -1, -1));

        field_telefone.setBackground(new java.awt.Color(217, 217, 217));

        field_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_telefone.setMinimumSize(new java.awt.Dimension(250, 50));
        field_telefone.setPreferredSize(new java.awt.Dimension(250, 50));
        field_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_telefoneActionPerformed(evt);
            }
        });
        jPanel1.add(field_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 193, -1, -1));

        jlbl_servico_prestado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_servico_prestado.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_servico_prestado.setText("Serviço prestado:");
        jPanel1.add(jlbl_servico_prestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 263, -1, -1));

        jcbox_Selecao_servico.setBackground(new java.awt.Color(217, 217, 217));
        jcbox_Selecao_servico.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        jcbox_Selecao_servico.setForeground(new java.awt.Color(217, 217, 217));
        jcbox_Selecao_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "DogWalker", "PetSitting", "DogWalker e PetSitting", "Cuidados Especiais" }));
        jcbox_Selecao_servico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcbox_Selecao_servico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbox_Selecao_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbox_Selecao_servicoActionPerformed(evt);
            }
        });
        jPanel1.add(jcbox_Selecao_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 284, 250, 50));

        jlbl_cep.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cep.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cep.setText("CEP:");
        jPanel1.add(jlbl_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 263, -1, -1));

        field_cep.setBackground(new java.awt.Color(217, 217, 217));
        field_cep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_cep.setMinimumSize(new java.awt.Dimension(150, 50));
        field_cep.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel1.add(field_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 282, -1, -1));

        jlbl_numero.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_numero.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_numero.setText("N°:");
        jPanel1.add(jlbl_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 263, -1, -1));

        field_numero.setBackground(new java.awt.Color(217, 217, 217));
        field_numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_numero.setPreferredSize(new java.awt.Dimension(90, 50));
        jPanel1.add(field_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 282, -1, -1));

        jlbl_rua.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_rua.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_rua.setText("Rua:");
        jPanel1.add(jlbl_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 350, -1, -1));

        field_rua.setBackground(new java.awt.Color(217, 217, 217));
        field_rua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_rua.setMinimumSize(new java.awt.Dimension(550, 50));
        field_rua.setPreferredSize(new java.awt.Dimension(550, 50));
        field_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ruaActionPerformed(evt);
            }
        });
        jPanel1.add(field_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jlbl_bairro.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_bairro.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_bairro.setText("Bairro:");
        jPanel1.add(jlbl_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 443, -1, -1));

        field_bairro.setBackground(new java.awt.Color(217, 217, 217));
        field_bairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_bairro.setMinimumSize(new java.awt.Dimension(270, 50));
        field_bairro.setPreferredSize(new java.awt.Dimension(270, 50));
        jPanel1.add(field_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 462, -1, -1));

        jlbl_cidade.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_cidade.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cidade.setText("Cidade:");
        jPanel1.add(jlbl_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 443, -1, -1));

        field_cidade.setBackground(new java.awt.Color(217, 217, 217));
        field_cidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        field_cidade.setMinimumSize(new java.awt.Dimension(250, 50));
        field_cidade.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel1.add(field_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 462, -1, -1));

        jbtn_cadastrarFuncionario.setBackground(new java.awt.Color(77, 120, 63));
        jbtn_cadastrarFuncionario.setFont(new java.awt.Font("Merriweather", 0, 20)); // NOI18N
        jbtn_cadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_cadastrarFuncionario.setText("CADASTRAR");
        jbtn_cadastrarFuncionario.setBorder(null);
        jbtn_cadastrarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastrarFuncionarioActionPerformed(evt);
            }
        });
        // Aplicando a UI personalizada
        jbtn_cadastrarFuncionario.setUI(new RoundedCornerButtonUI());
        jPanel1.add(jbtn_cadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 557, 240, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 40, 670, 640));

        jlbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        jlbl_background.setText("   ");
        jlbl_background.setMaximumSize(new java.awt.Dimension(1366, 768));
        jlbl_background.setMinimumSize(new java.awt.Dimension(1366, 768));
        jlbl_background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jlbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void field_nome_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_funcionarioActionPerformed

    private void field_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_telefoneActionPerformed

    private void field_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_ruaActionPerformed

    private void jbtn_cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastrarFuncionarioActionPerformed
        Usuario cadastrar = getFieldsInfo(); // Retorna null se informações forem inválidas
        if (cadastrar != null) {
            int r = BD.Usuario.insert(cadastrar);
            if (r > 0) { // Insert funcionou
                clearFieldsInfo();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            }
        }
    }//GEN-LAST:event_jbtn_cadastrarFuncionarioActionPerformed

    private void jcbox_Selecao_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbox_Selecao_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbox_Selecao_servicoActionPerformed
    private void initMenuPanel() {
        MenuPanel menuPanel = new MenuPanel();
        jPanel_menu.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 768));
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
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field_bairro;
    private javax.swing.JTextField field_cep;
    private javax.swing.JTextField field_cidade;
    private javax.swing.JTextField field_cpf;
    private javax.swing.JTextField field_nome_funcionario;
    private javax.swing.JTextField field_numero;
    private javax.swing.JTextField field_rua;
    private javax.swing.JTextField field_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JButton jbtn_cadastrarFuncionario;
    private javax.swing.JComboBox<String> jcbox_Selecao_servico;
    private javax.swing.JLabel jlbl_background;
    private javax.swing.JLabel jlbl_bairro;
    private javax.swing.JLabel jlbl_cep;
    private javax.swing.JLabel jlbl_cidade;
    private javax.swing.JLabel jlbl_cpf;
    private javax.swing.JLabel jlbl_nome_funcionario;
    private javax.swing.JLabel jlbl_numero;
    private javax.swing.JLabel jlbl_rua;
    private javax.swing.JLabel jlbl_servico_prestado;
    private javax.swing.JLabel jlbl_telefone;
    private javax.swing.JLabel lbl_cadastrarFuncinario;
    // End of variables declaration//GEN-END:variables
}
