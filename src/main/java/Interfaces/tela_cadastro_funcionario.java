/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author kevin
 */
public class tela_cadastro_funcionario extends javax.swing.JFrame {

    /**
     * Creates new form tela_cadastro_funcionario
     */
    public tela_cadastro_funcionario() {
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

        jpanel_menu_cadastro_funcionario = new javax.swing.JPanel();
        jpanel_agenda = new javax.swing.JPanel();
        jlbl_icon_agenda = new javax.swing.JLabel();
        jpanel_financeiro = new javax.swing.JPanel();
        jlbl_icon_financeiro = new javax.swing.JLabel();
        jpanel_cadastrar_cliente = new javax.swing.JPanel();
        jlbl_icon_cliente = new javax.swing.JLabel();
        jpanel_cadastrar_funcionario = new javax.swing.JPanel();
        jlbl_icon_funcionario = new javax.swing.JLabel();
        jpanel_lista_pets = new javax.swing.JPanel();
        jlbl_icon_pets = new javax.swing.JLabel();
        jpanel_configuracoes = new javax.swing.JPanel();
        jlbl_icon_configuracoes = new javax.swing.JLabel();
        jpanel_sair = new javax.swing.JPanel();
        jlbl_icon_sair = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbl_cpf = new javax.swing.JLabel();
        jlbl_rua = new javax.swing.JLabel();
        jlbl_cidade = new javax.swing.JLabel();
        jlbl_nome_funcionario = new javax.swing.JLabel();
        jlbl_bairro = new javax.swing.JLabel();
        field_cep = new javax.swing.JTextField();
        field_bairro = new javax.swing.JTextField();
        jlbl_numero = new javax.swing.JLabel();
        field_telefone = new javax.swing.JTextField();
        field_cidade = new javax.swing.JTextField();
        field_cpf = new javax.swing.JTextField();
        jlbl_servico_prestado = new javax.swing.JLabel();
        field_servico_prestado = new javax.swing.JTextField();
        field_nome_funcionario = new javax.swing.JTextField();
        jlbl_telefone = new javax.swing.JLabel();
        field_numero = new javax.swing.JTextField();
        jlbl_cep = new javax.swing.JLabel();
        field_rua = new javax.swing.JTextField();
        jbutton_cadastrar = new javax.swing.JButton();
        jlbl_background_cadastro_funcionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_menu_cadastro_funcionario.setBackground(new java.awt.Color(124, 115, 101));
        jpanel_menu_cadastro_funcionario.setForeground(new java.awt.Color(124, 115, 101));

        jpanel_agenda.setBackground(new java.awt.Color(0, 0, 0));

        jlbl_icon_agenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Desktop\\PetAgenda\\src\\main\\java\\IMAGENS\\icon agenda.png")); // NOI18N

        javax.swing.GroupLayout jpanel_agendaLayout = new javax.swing.GroupLayout(jpanel_agenda);
        jpanel_agenda.setLayout(jpanel_agendaLayout);
        jpanel_agendaLayout.setHorizontalGroup(
            jpanel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_agendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_icon_agenda)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jpanel_agendaLayout.setVerticalGroup(
            jpanel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_agendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_icon_agenda)
                .addContainerGap())
        );

        jpanel_financeiro.setBackground(new java.awt.Color(0, 0, 0));
        jpanel_financeiro.setPreferredSize(new java.awt.Dimension(250, 60));

        jlbl_icon_financeiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Desktop\\PetAgenda\\src\\main\\java\\IMAGENS\\icon financeiro.png")); // NOI18N

        javax.swing.GroupLayout jpanel_financeiroLayout = new javax.swing.GroupLayout(jpanel_financeiro);
        jpanel_financeiro.setLayout(jpanel_financeiroLayout);
        jpanel_financeiroLayout.setHorizontalGroup(
            jpanel_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_financeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_icon_financeiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_financeiroLayout.setVerticalGroup(
            jpanel_financeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_financeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_icon_financeiro)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpanel_cadastrar_cliente.setBackground(new java.awt.Color(0, 0, 0));
        jpanel_cadastrar_cliente.setPreferredSize(new java.awt.Dimension(250, 60));

        javax.swing.GroupLayout jpanel_cadastrar_clienteLayout = new javax.swing.GroupLayout(jpanel_cadastrar_cliente);
        jpanel_cadastrar_cliente.setLayout(jpanel_cadastrar_clienteLayout);
        jpanel_cadastrar_clienteLayout.setHorizontalGroup(
            jpanel_cadastrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_cadastrar_clienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlbl_icon_cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_cadastrar_clienteLayout.setVerticalGroup(
            jpanel_cadastrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_cadastrar_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_icon_cliente)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jpanel_cadastrar_funcionario.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpanel_cadastrar_funcionarioLayout = new javax.swing.GroupLayout(jpanel_cadastrar_funcionario);
        jpanel_cadastrar_funcionario.setLayout(jpanel_cadastrar_funcionarioLayout);
        jpanel_cadastrar_funcionarioLayout.setHorizontalGroup(
            jpanel_cadastrar_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_cadastrar_funcionarioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlbl_icon_funcionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_cadastrar_funcionarioLayout.setVerticalGroup(
            jpanel_cadastrar_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_cadastrar_funcionarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbl_icon_funcionario)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jpanel_lista_pets.setBackground(new java.awt.Color(0, 0, 0));
        jpanel_lista_pets.setPreferredSize(new java.awt.Dimension(250, 60));

        javax.swing.GroupLayout jpanel_lista_petsLayout = new javax.swing.GroupLayout(jpanel_lista_pets);
        jpanel_lista_pets.setLayout(jpanel_lista_petsLayout);
        jpanel_lista_petsLayout.setHorizontalGroup(
            jpanel_lista_petsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_lista_petsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jlbl_icon_pets)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_lista_petsLayout.setVerticalGroup(
            jpanel_lista_petsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_lista_petsLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jlbl_icon_pets)
                .addGap(21, 21, 21))
        );

        jpanel_configuracoes.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpanel_configuracoesLayout = new javax.swing.GroupLayout(jpanel_configuracoes);
        jpanel_configuracoes.setLayout(jpanel_configuracoesLayout);
        jpanel_configuracoesLayout.setHorizontalGroup(
            jpanel_configuracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_configuracoesLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jlbl_icon_configuracoes)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jpanel_configuracoesLayout.setVerticalGroup(
            jpanel_configuracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_configuracoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbl_icon_configuracoes)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jpanel_sair.setBackground(new java.awt.Color(0, 0, 0));
        jpanel_sair.setPreferredSize(new java.awt.Dimension(250, 60));

        javax.swing.GroupLayout jpanel_sairLayout = new javax.swing.GroupLayout(jpanel_sair);
        jpanel_sair.setLayout(jpanel_sairLayout);
        jpanel_sairLayout.setHorizontalGroup(
            jpanel_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_sairLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbl_icon_sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_sairLayout.setVerticalGroup(
            jpanel_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_sairLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbl_icon_sair)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanel_menu_cadastro_funcionarioLayout = new javax.swing.GroupLayout(jpanel_menu_cadastro_funcionario);
        jpanel_menu_cadastro_funcionario.setLayout(jpanel_menu_cadastro_funcionarioLayout);
        jpanel_menu_cadastro_funcionarioLayout.setHorizontalGroup(
            jpanel_menu_cadastro_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_menu_cadastro_funcionarioLayout.createSequentialGroup()
                .addComponent(jpanel_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jpanel_financeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanel_cadastrar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanel_cadastrar_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanel_lista_pets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_menu_cadastro_funcionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpanel_menu_cadastro_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_configuracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpanel_menu_cadastro_funcionarioLayout.setVerticalGroup(
            jpanel_menu_cadastro_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_menu_cadastro_funcionarioLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jpanel_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jpanel_financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jpanel_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_lista_pets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_configuracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jpanel_menu_cadastro_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlbl_cpf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_cpf.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cpf.setText("CPF:");

        jlbl_rua.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_rua.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_rua.setText("Rua:");

        jlbl_cidade.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_cidade.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cidade.setText("Cidade:");

        jlbl_nome_funcionario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_nome_funcionario.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_nome_funcionario.setText("Nome do funcionário:");

        jlbl_bairro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_bairro.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_bairro.setText("Bairro:");

        field_cep.setBackground(new java.awt.Color(255, 255, 255));
        field_cep.setPreferredSize(new java.awt.Dimension(200, 60));

        field_bairro.setBackground(new java.awt.Color(255, 255, 255));
        field_bairro.setPreferredSize(new java.awt.Dimension(320, 60));

        jlbl_numero.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_numero.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_numero.setText("N°:");

        field_telefone.setBackground(new java.awt.Color(255, 255, 255));
        field_telefone.setPreferredSize(new java.awt.Dimension(300, 60));
        field_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_telefoneActionPerformed(evt);
            }
        });

        field_cidade.setBackground(new java.awt.Color(255, 255, 255));
        field_cidade.setPreferredSize(new java.awt.Dimension(300, 60));

        field_cpf.setBackground(new java.awt.Color(255, 255, 255));
        field_cpf.setPreferredSize(new java.awt.Dimension(320, 60));

        jlbl_servico_prestado.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_servico_prestado.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_servico_prestado.setText("Serviço prestado:");

        field_servico_prestado.setBackground(new java.awt.Color(255, 255, 255));
        field_servico_prestado.setPreferredSize(new java.awt.Dimension(300, 60));
        field_servico_prestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_servico_prestadoActionPerformed(evt);
            }
        });

        field_nome_funcionario.setBackground(new java.awt.Color(255, 255, 255));
        field_nome_funcionario.setPreferredSize(new java.awt.Dimension(653, 60));
        field_nome_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_funcionarioActionPerformed(evt);
            }
        });

        jlbl_telefone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_telefone.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone.setText("Telefone:");

        field_numero.setBackground(new java.awt.Color(255, 255, 255));
        field_numero.setPreferredSize(new java.awt.Dimension(100, 60));

        jlbl_cep.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jlbl_cep.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cep.setText("CEP:");

        field_rua.setBackground(new java.awt.Color(255, 255, 255));
        field_rua.setPreferredSize(new java.awt.Dimension(653, 60));
        field_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ruaActionPerformed(evt);
            }
        });

        jbutton_cadastrar.setBackground(new java.awt.Color(71, 120, 63));
        jbutton_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jbutton_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jbutton_cadastrar.setText("Cadastrar");
        jbutton_cadastrar.setPreferredSize(new java.awt.Dimension(300, 40));
        jbutton_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_nome_funcionario)
                            .addComponent(field_nome_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_rua)
                            .addComponent(field_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_cpf))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_telefone)
                                    .addComponent(field_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_servico_prestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_servico_prestado))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_cep))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_numero)
                                    .addComponent(field_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_bairro))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_cidade)
                                    .addComponent(field_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jbutton_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbl_nome_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_nome_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_cpf)
                    .addComponent(jlbl_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_cep)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbl_servico_prestado)
                        .addComponent(jlbl_numero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_servico_prestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlbl_rua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_bairro)
                    .addComponent(jlbl_cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jbutton_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 760, 630));

        jlbl_background_cadastro_funcionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Desktop\\PetAgenda\\src\\main\\java\\IMAGENS\\BG_padrao.png")); // NOI18N
        getContentPane().add(jlbl_background_cadastro_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_nome_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_funcionarioActionPerformed

    private void field_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_telefoneActionPerformed

    private void field_servico_prestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_servico_prestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_servico_prestadoActionPerformed

    private void field_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_ruaActionPerformed

    private void jbutton_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_cadastrarActionPerformed

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
    private javax.swing.JTextField field_servico_prestado;
    private javax.swing.JTextField field_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutton_cadastrar;
    private javax.swing.JLabel jlbl_background_cadastro_funcionario;
    private javax.swing.JLabel jlbl_bairro;
    private javax.swing.JLabel jlbl_cep;
    private javax.swing.JLabel jlbl_cidade;
    private javax.swing.JLabel jlbl_cpf;
    private javax.swing.JLabel jlbl_icon_agenda;
    private javax.swing.JLabel jlbl_icon_cliente;
    private javax.swing.JLabel jlbl_icon_configuracoes;
    private javax.swing.JLabel jlbl_icon_financeiro;
    private javax.swing.JLabel jlbl_icon_funcionario;
    private javax.swing.JLabel jlbl_icon_pets;
    private javax.swing.JLabel jlbl_icon_sair;
    private javax.swing.JLabel jlbl_nome_funcionario;
    private javax.swing.JLabel jlbl_numero;
    private javax.swing.JLabel jlbl_rua;
    private javax.swing.JLabel jlbl_servico_prestado;
    private javax.swing.JLabel jlbl_telefone;
    private javax.swing.JPanel jpanel_agenda;
    private javax.swing.JPanel jpanel_cadastrar_cliente;
    private javax.swing.JPanel jpanel_cadastrar_funcionario;
    private javax.swing.JPanel jpanel_configuracoes;
    private javax.swing.JPanel jpanel_financeiro;
    private javax.swing.JPanel jpanel_lista_pets;
    private javax.swing.JPanel jpanel_menu_cadastro_funcionario;
    private javax.swing.JPanel jpanel_sair;
    // End of variables declaration//GEN-END:variables
}