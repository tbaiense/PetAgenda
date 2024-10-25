package Interfaces;

import ui.custom.RoundedCornerBorder;
import ui.custom.RoundedCornerButtonUI;

/**
 *
 * @author Thiago M. Baiense
 */
public class tela_agendamento extends javax.swing.JFrame {

    public tela_agendamento() {
        initComponents();
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_linha = new javax.swing.JLabel();
        label_nome_do_pet = new javax.swing.JLabel();
        field_nome_Pet = new javax.swing.JTextField();
        label_sexo = new javax.swing.JLabel();
        jcmbBx_Sexo = new javax.swing.JComboBox<>();
        label_comportamento_do_pet = new javax.swing.JLabel();
        jtxtArea_Comportamento = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbtn_cadastrarPet = new javax.swing.JButton();
        field_nome_Pet1 = new javax.swing.JTextField();
        label_nome_do_pet1 = new javax.swing.JLabel();
        label_nome_do_pet2 = new javax.swing.JLabel();
        field_nome_Pet2 = new javax.swing.JTextField();
        label_nome_do_pet3 = new javax.swing.JLabel();
        field_nome_Pet3 = new javax.swing.JTextField();
        field_nome_Pet4 = new javax.swing.JTextField();
        label_nome_do_pet4 = new javax.swing.JLabel();
        label_nome_do_pet5 = new javax.swing.JLabel();
        field_nome_Pet5 = new javax.swing.JTextField();
        label_sexo1 = new javax.swing.JLabel();
        jcmbBx_Sexo2 = new javax.swing.JComboBox<>();
        jcmbBx_Sexo3 = new javax.swing.JComboBox<>();
        label_sexo3 = new javax.swing.JLabel();
        jcmbBx_Sexo4 = new javax.swing.JComboBox<>();
        label_sexo4 = new javax.swing.JLabel();
        label_nome_do_pet6 = new javax.swing.JLabel();
        field_nome_Pet6 = new javax.swing.JTextField();
        label_nome_do_pet7 = new javax.swing.JLabel();
        field_nome_Pet7 = new javax.swing.JTextField();
        field_nome_Pet8 = new javax.swing.JTextField();
        label_nome_do_pet8 = new javax.swing.JLabel();
        label_nome_do_pet9 = new javax.swing.JLabel();
        field_nome_Pet9 = new javax.swing.JTextField();
        label_sexo5 = new javax.swing.JLabel();
        jcmbBx_Sexo5 = new javax.swing.JComboBox<>();
        label_nome_do_pet10 = new javax.swing.JLabel();
        field_nome_Pet10 = new javax.swing.JTextField();
        label_nome_do_pet11 = new javax.swing.JLabel();
        field_nome_Pet11 = new javax.swing.JTextField();
        label_sexo2 = new javax.swing.JLabel();
        jcmbBx_Sexo1 = new javax.swing.JComboBox<>();
        label_nome_do_pet12 = new javax.swing.JLabel();
        field_nome_Pet12 = new javax.swing.JTextField();
        jcmbBx_Sexo6 = new javax.swing.JComboBox<>();
        label_sexo6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        lbl_CadastrarPet3 = new javax.swing.JLabel();
        label_sexo7 = new javax.swing.JLabel();
        lbl_CadastrarPet1 = new javax.swing.JLabel();
        lbl_CadastrarPet2 = new javax.swing.JLabel();
        lbl_CadastrarPet4 = new javax.swing.JLabel();
        lbl_linha2 = new javax.swing.JLabel();
        lbl_linha1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_sexo8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jlbl_background_cadastro_pet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetAgenda - Cadastrar agendamento");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
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
        btn_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_financeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_funcionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_pets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_config.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(880, 690));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(880, 690));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(880, 690));
        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(870, 2147483647));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setFont(new java.awt.Font("Merriweather", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(899, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_linha.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_linha.setForeground(new java.awt.Color(0, 0, 0));
        lbl_linha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        lbl_linha.setText(" ");
        lbl_linha.setToolTipText("");
        jPanel1.add(lbl_linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        label_nome_do_pet.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet.setText("Pet");
        jPanel1.add(label_nome_do_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        field_nome_Pet.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_PetActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 340, -1));

        label_sexo.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo.setText("Tipo do serviço");
        jPanel1.add(label_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jcmbBx_Sexo.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, -1));

        label_comportamento_do_pet.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_comportamento_do_pet.setForeground(new java.awt.Color(0, 0, 0));
        label_comportamento_do_pet.setText("Comportamento do Pet:");
        jPanel1.add(label_comportamento_do_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1170, -1, -1));

        jtxtArea_Comportamento.setBackground(new java.awt.Color(217, 217, 217));
        jtxtArea_Comportamento.setBorder(null);
        jtxtArea_Comportamento.setForeground(new java.awt.Color(0, 0, 0));
        jtxtArea_Comportamento.setMinimumSize(new java.awt.Dimension(810, 90));
        jtxtArea_Comportamento.setPreferredSize(new java.awt.Dimension(810, 90));

        jTextArea1.setBackground(new java.awt.Color(217, 217, 217));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new RoundedCornerBorder(50));
        jTextArea1.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setPreferredSize(new java.awt.Dimension(800, 80));
        jtxtArea_Comportamento.setViewportView(jTextArea1);

        jPanel1.add(jtxtArea_Comportamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1200, 790, 50));

        jbtn_cadastrarPet.setBackground(new java.awt.Color(77, 120, 63));
        jbtn_cadastrarPet.setFont(new java.awt.Font("Merriweather", 0, 20)); // NOI18N
        jbtn_cadastrarPet.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_cadastrarPet.setText("CADASTRAR");
        jbtn_cadastrarPet.setBorder(null);
        jbtn_cadastrarPet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtn_cadastrarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cadastrarPetActionPerformed(evt);
            }
        });
        // Aplicando a UI personalizada
        jbtn_cadastrarPet.setUI(new RoundedCornerButtonUI());
        jPanel1.add(jbtn_cadastrarPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1440, 240, 50));

        field_nome_Pet1.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet1.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet1.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet1.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet1.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet1ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 190, -1));

        label_nome_do_pet1.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet1.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet1.setText("Data de encerramento");
        jPanel1.add(label_nome_do_pet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        label_nome_do_pet2.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet2.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet2.setText("Endereço do Pet");
        jPanel1.add(label_nome_do_pet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        field_nome_Pet2.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet2.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet2.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet2.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet2.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet2ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 410, -1));

        label_nome_do_pet3.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet3.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet3.setText("Data de início do pacote");
        jPanel1.add(label_nome_do_pet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 180, -1));

        field_nome_Pet3.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet3.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet3.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet3.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet3.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet3ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 190, -1));

        field_nome_Pet4.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet4.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet4.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet4.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet4.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet4ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 230, -1));

        label_nome_do_pet4.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet4.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet4.setText("Data agendada");
        jPanel1.add(label_nome_do_pet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 130, -1));

        label_nome_do_pet5.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet5.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet5.setText("Horário agend.");
        jPanel1.add(label_nome_do_pet5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 110, -1));

        field_nome_Pet5.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet5.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet5.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet5.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet5.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet5ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, 120, -1));

        label_sexo1.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo1.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo1.setText("Serviço agendado");
        jPanel1.add(label_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 140, -1));

        jcmbBx_Sexo2.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo2.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo2.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo2.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo2.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo2.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 320, -1));

        jcmbBx_Sexo3.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo3.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo3.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo3.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo3.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo3.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 270, -1));

        label_sexo3.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo3.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo3.setText("Quantidade");
        jPanel1.add(label_sexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 120, -1));

        jcmbBx_Sexo4.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo4.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo4.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo4.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo4.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo4.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 930, 330, -1));

        label_sexo4.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo4.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo4.setText("Remédios adicionados");
        jPanel1.add(label_sexo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 910, 170, -1));

        label_nome_do_pet6.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet6.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet6.setText("Remédio");
        jPanel1.add(label_nome_do_pet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 820, 500, -1));

        field_nome_Pet6.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet6.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet6.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet6.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet6.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet6ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 840, 600, -1));

        label_nome_do_pet7.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet7.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet7.setText("Instruções de administração");
        jPanel1.add(label_nome_do_pet7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 910, 250, -1));

        field_nome_Pet7.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet7.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet7.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet7.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet7.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet7ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 930, 350, -1));

        field_nome_Pet8.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet8.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet8.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet8.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet8.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet8ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1340, 330, -1));

        label_nome_do_pet8.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet8.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet8.setText("Dono do Pet");
        jPanel1.add(label_nome_do_pet8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1320, 230, -1));

        label_nome_do_pet9.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet9.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet9.setText("Dono do Pet");
        jPanel1.add(label_nome_do_pet9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1320, 230, -1));

        field_nome_Pet9.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet9.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet9.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet9.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet9.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet9ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1340, 330, -1));

        label_sexo5.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo5.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo5.setText("Funcionário agendado");
        jPanel1.add(label_sexo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 160, 20));

        jcmbBx_Sexo5.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo5.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo5.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo5.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo5.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo5.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 370, -1));

        label_nome_do_pet10.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet10.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet10.setText("Dono do Pet");
        jPanel1.add(label_nome_do_pet10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        field_nome_Pet10.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet10.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet10.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet10.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet10.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet10ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, -1));

        label_nome_do_pet11.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet11.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet11.setText("Local do cuidado");
        jPanel1.add(label_nome_do_pet11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1080, 130, -1));

        field_nome_Pet11.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet11.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet11.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet11.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet11.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet11ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1100, 790, -1));

        label_sexo2.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo2.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo2.setText("Tipo do agendamento");
        jPanel1.add(label_sexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, -1));

        jcmbBx_Sexo1.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo1.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo1.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo1.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo1.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 270, -1));

        label_nome_do_pet12.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_nome_do_pet12.setForeground(new java.awt.Color(0, 0, 0));
        label_nome_do_pet12.setText("Horário");
        jPanel1.add(label_nome_do_pet12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 820, 80, -1));

        field_nome_Pet12.setBackground(new java.awt.Color(217, 217, 217));
        field_nome_Pet12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        field_nome_Pet12.setBorder(new RoundedCornerBorder(50));
        field_nome_Pet12.setCaretColor(new java.awt.Color(0, 0, 0));
        field_nome_Pet12.setMinimumSize(new java.awt.Dimension(250, 50));
        field_nome_Pet12.setPreferredSize(new java.awt.Dimension(250, 50));
        field_nome_Pet12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nome_Pet12ActionPerformed(evt);
            }
        });
        jPanel1.add(field_nome_Pet12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 840, 90, -1));

        jcmbBx_Sexo6.setBackground(new java.awt.Color(217, 217, 217));
        jcmbBx_Sexo6.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmbBx_Sexo6.setForeground(new java.awt.Color(0, 0, 0));
        jcmbBx_Sexo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Fêmea", "Macho" }));
        jcmbBx_Sexo6.setBorder(new RoundedCornerBorder(50));
        jcmbBx_Sexo6.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmbBx_Sexo6.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmbBx_Sexo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 280, -1));

        label_sexo6.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo6.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo6.setText("A cada");
        jPanel1.add(label_sexo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 50, -1));

        jSpinner1.setBorder(new RoundedCornerBorder(50));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 90, 50));

        lbl_CadastrarPet3.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_CadastrarPet3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CadastrarPet3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adic remedio.png"))); // NOI18N
        lbl_CadastrarPet3.setText(" ");
        lbl_CadastrarPet3.setToolTipText("");
        jPanel1.add(lbl_CadastrarPet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        label_sexo7.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo7.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo7.setText("Intervalo");
        jPanel1.add(label_sexo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 100, -1));

        lbl_CadastrarPet1.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_CadastrarPet1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CadastrarPet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cadastrar agendamento.png"))); // NOI18N
        lbl_CadastrarPet1.setText(" ");
        lbl_CadastrarPet1.setToolTipText("");
        jPanel1.add(lbl_CadastrarPet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lbl_CadastrarPet2.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_CadastrarPet2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CadastrarPet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modalidade de agendamento.png"))); // NOI18N
        lbl_CadastrarPet2.setText(" ");
        lbl_CadastrarPet2.setToolTipText("");
        jPanel1.add(lbl_CadastrarPet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        lbl_CadastrarPet4.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_CadastrarPet4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CadastrarPet4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info adicional pet.png"))); // NOI18N
        lbl_CadastrarPet4.setText(" ");
        lbl_CadastrarPet4.setToolTipText("");
        jPanel1.add(lbl_CadastrarPet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1260, -1, -1));

        lbl_linha2.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_linha2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_linha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        lbl_linha2.setText(" ");
        lbl_linha2.setToolTipText("");
        jPanel1.add(lbl_linha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1020, -1, -1));

        lbl_linha1.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_linha1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_linha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        lbl_linha1.setText(" ");
        lbl_linha1.setToolTipText("");
        jPanel1.add(lbl_linha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn buscar.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn remover pet.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn editar.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1000, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn adicionar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1000, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn remover.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1000, -1, -1));

        label_sexo8.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        label_sexo8.setForeground(new java.awt.Color(0, 0, 0));
        label_sexo8.setText("Passeios");
        jPanel1.add(label_sexo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 70, -1));

        jSpinner2.setBorder(new RoundedCornerBorder(50));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 90, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 1530));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 46, 880, 690));

        jlbl_background_cadastro_pet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        getContentPane().add(jlbl_background_cadastro_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HomeMousePressed

    private void btn_HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HomeMouseReleased

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        // TODO add your handling code here:
        Tela_Inicial telaPrincipal = new Tela_Inicial();
        telaPrincipal.setVisible(true);
        this.dispose();
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

    private void jbtn_cadastrarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cadastrarPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_cadastrarPetActionPerformed

    private void field_nome_PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_PetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_PetActionPerformed

    private void field_nome_Pet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet1ActionPerformed

    private void field_nome_Pet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet2ActionPerformed

    private void field_nome_Pet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet3ActionPerformed

    private void field_nome_Pet4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet4ActionPerformed

    private void field_nome_Pet5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet5ActionPerformed

    private void field_nome_Pet6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet6ActionPerformed

    private void field_nome_Pet7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet7ActionPerformed

    private void field_nome_Pet8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet8ActionPerformed

    private void field_nome_Pet9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet9ActionPerformed

    private void field_nome_Pet10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet10ActionPerformed

    private void field_nome_Pet11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet11ActionPerformed

    private void field_nome_Pet12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nome_Pet12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nome_Pet12ActionPerformed

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
            java.util.logging.Logger.getLogger(tela_agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_agendamento().setVisible(true);
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
    private javax.swing.JTextField field_nome_Pet;
    private javax.swing.JTextField field_nome_Pet1;
    private javax.swing.JTextField field_nome_Pet10;
    private javax.swing.JTextField field_nome_Pet11;
    private javax.swing.JTextField field_nome_Pet12;
    private javax.swing.JTextField field_nome_Pet2;
    private javax.swing.JTextField field_nome_Pet3;
    private javax.swing.JTextField field_nome_Pet4;
    private javax.swing.JTextField field_nome_Pet5;
    private javax.swing.JTextField field_nome_Pet6;
    private javax.swing.JTextField field_nome_Pet7;
    private javax.swing.JTextField field_nome_Pet8;
    private javax.swing.JTextField field_nome_Pet9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtn_cadastrarPet;
    private javax.swing.JComboBox<String> jcmbBx_Sexo;
    private javax.swing.JComboBox<String> jcmbBx_Sexo1;
    private javax.swing.JComboBox<String> jcmbBx_Sexo2;
    private javax.swing.JComboBox<String> jcmbBx_Sexo3;
    private javax.swing.JComboBox<String> jcmbBx_Sexo4;
    private javax.swing.JComboBox<String> jcmbBx_Sexo5;
    private javax.swing.JComboBox<String> jcmbBx_Sexo6;
    private javax.swing.JLabel jlbl_background_cadastro_pet;
    private javax.swing.JScrollPane jtxtArea_Comportamento;
    private javax.swing.JLabel label_comportamento_do_pet;
    private javax.swing.JLabel label_nome_do_pet;
    private javax.swing.JLabel label_nome_do_pet1;
    private javax.swing.JLabel label_nome_do_pet10;
    private javax.swing.JLabel label_nome_do_pet11;
    private javax.swing.JLabel label_nome_do_pet12;
    private javax.swing.JLabel label_nome_do_pet2;
    private javax.swing.JLabel label_nome_do_pet3;
    private javax.swing.JLabel label_nome_do_pet4;
    private javax.swing.JLabel label_nome_do_pet5;
    private javax.swing.JLabel label_nome_do_pet6;
    private javax.swing.JLabel label_nome_do_pet7;
    private javax.swing.JLabel label_nome_do_pet8;
    private javax.swing.JLabel label_nome_do_pet9;
    private javax.swing.JLabel label_sexo;
    private javax.swing.JLabel label_sexo1;
    private javax.swing.JLabel label_sexo2;
    private javax.swing.JLabel label_sexo3;
    private javax.swing.JLabel label_sexo4;
    private javax.swing.JLabel label_sexo5;
    private javax.swing.JLabel label_sexo6;
    private javax.swing.JLabel label_sexo7;
    private javax.swing.JLabel label_sexo8;
    private javax.swing.JLabel lbl_CadastrarPet1;
    private javax.swing.JLabel lbl_CadastrarPet2;
    private javax.swing.JLabel lbl_CadastrarPet3;
    private javax.swing.JLabel lbl_CadastrarPet4;
    private javax.swing.JLabel lbl_linha;
    private javax.swing.JLabel lbl_linha1;
    private javax.swing.JLabel lbl_linha2;
    // End of variables declaration//GEN-END:variables
}
