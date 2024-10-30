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
        jlbl_img_linha1 = new javax.swing.JLabel();
        jlbl_nomePet = new javax.swing.JLabel();
        jtxtf_nomePet = new javax.swing.JTextField();
        jlbl_tipoServico = new javax.swing.JLabel();
        jcmb_tipoServico = new javax.swing.JComboBox<>();
        jlbl_observacao = new javax.swing.JLabel();
        jscp_jtxta_observacao = new javax.swing.JScrollPane();
        jtxta_observacao = new javax.swing.JTextArea();
        jbtn_cadastrarPet = new javax.swing.JButton();
        jtxtf_dtEncerramentoPacote = new javax.swing.JTextField();
        jlbl_dtEncerramentoPacote = new javax.swing.JLabel();
        jlbl_enderecoPet = new javax.swing.JLabel();
        jtxtf_enderecoPet = new javax.swing.JTextField();
        jlbl_dtInicioPacote = new javax.swing.JLabel();
        jtxtf_dtInicioPacote = new javax.swing.JTextField();
        jtxtf_dtAgendada = new javax.swing.JTextField();
        jlbl_dtAgendada = new javax.swing.JLabel();
        jlbl_hrAgendada = new javax.swing.JLabel();
        jtxtf_hrAgendada = new javax.swing.JTextField();
        jlbl_servicoAgendado = new javax.swing.JLabel();
        jcmb_servicoAgendado = new javax.swing.JComboBox<>();
        jcmb_quantidadePacote = new javax.swing.JComboBox<>();
        jlbl_quantidadePacote = new javax.swing.JLabel();
        jcmb_remediosAdicionados = new javax.swing.JComboBox<>();
        jlbl_remediosAdicionados = new javax.swing.JLabel();
        jlbl_remedio = new javax.swing.JLabel();
        jtxtf_remedio = new javax.swing.JTextField();
        jlbl_intrucaoAdministracao = new javax.swing.JLabel();
        jtxtf_intrucaoAdministracao = new javax.swing.JTextField();
        jtxtf_buscarCom = new javax.swing.JTextField();
        jlbl_devolverPara = new javax.swing.JLabel();
        jlbl_buscarCom = new javax.swing.JLabel();
        jtxtf_devolverPara = new javax.swing.JTextField();
        jlbl_funcionarioAgendado = new javax.swing.JLabel();
        jcmb_funcionarioAgendado = new javax.swing.JComboBox<>();
        jlbl_donoPet = new javax.swing.JLabel();
        jtxtf_donoPet = new javax.swing.JTextField();
        jlbl_localCuidado = new javax.swing.JLabel();
        jtxtf_localCuidado = new javax.swing.JTextField();
        jlbl_tipoAgendamento = new javax.swing.JLabel();
        jcmb_tipoAgendamento = new javax.swing.JComboBox<>();
        jlbl_horarioRemedio = new javax.swing.JLabel();
        jtxtf_horarioRemedio = new javax.swing.JTextField();
        jcmb_intervalo = new javax.swing.JComboBox<>();
        jlbl_aCada = new javax.swing.JLabel();
        jspn_aCada = new javax.swing.JSpinner();
        jlbl_img_adicionarRemedio = new javax.swing.JLabel();
        jlbl_intervalo = new javax.swing.JLabel();
        lbl_CadastrarPet1 = new javax.swing.JLabel();
        jlbl_img_modalidadeAgendamento = new javax.swing.JLabel();
        jlbl_img_infoAdicionalPet = new javax.swing.JLabel();
        jlbl_img_linha2 = new javax.swing.JLabel();
        jlbl_img_linha3 = new javax.swing.JLabel();
        jlbl_btnBuscar = new javax.swing.JLabel();
        jlbl_btnLimparPet = new javax.swing.JLabel();
        jlbl_btn_editarRemedio = new javax.swing.JLabel();
        jlbl_btn_adicionarRemedio = new javax.swing.JLabel();
        jlbl_btn_removerRemedio = new javax.swing.JLabel();
        jlbl_passeios = new javax.swing.JLabel();
        jspn_passeios = new javax.swing.JSpinner();
        jlbl_background = new javax.swing.JLabel();

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
        jPanel1.setMaximumSize(new java.awt.Dimension(845, 1653));
        jPanel1.setMinimumSize(new java.awt.Dimension(845, 1653));
        jPanel1.setPreferredSize(new java.awt.Dimension(899, 1653));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_img_linha1.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_linha1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_linha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        jlbl_img_linha1.setText(" ");
        jlbl_img_linha1.setToolTipText("");
        jPanel1.add(jlbl_img_linha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, 10));

        jlbl_nomePet.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_nomePet.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_nomePet.setText("Pet");
        jPanel1.add(jlbl_nomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jtxtf_nomePet.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_nomePet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_nomePet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_nomePet.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_nomePet.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_nomePet.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_nomePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_nomePetActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_nomePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 340, -1));

        jlbl_tipoServico.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_tipoServico.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_tipoServico.setText("Tipo do serviço");
        jPanel1.add(jlbl_tipoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jcmb_tipoServico.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_tipoServico.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_tipoServico.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_tipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Atendimento doméstico", "Cuidado especial", "Passeio" }));
        jcmb_tipoServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_tipoServico.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_tipoServico.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_tipoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, -1));

        jlbl_observacao.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_observacao.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_observacao.setText("Observação");
        jPanel1.add(jlbl_observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1170, -1, -1));

        jscp_jtxta_observacao.setBackground(new java.awt.Color(217, 217, 217));
        jscp_jtxta_observacao.setBorder(null);
        jscp_jtxta_observacao.setForeground(new java.awt.Color(0, 0, 0));
        jscp_jtxta_observacao.setMinimumSize(new java.awt.Dimension(790, 140));
        jscp_jtxta_observacao.setPreferredSize(new java.awt.Dimension(790, 140));

        jtxta_observacao.setBackground(new java.awt.Color(217, 217, 217));
        jtxta_observacao.setColumns(20);
        jtxta_observacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxta_observacao.setForeground(new java.awt.Color(0, 0, 0));
        jtxta_observacao.setRows(5);
        jtxta_observacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxta_observacao.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxta_observacao.setMargin(new java.awt.Insets(16, 16, 16, 16));
        jtxta_observacao.setMaximumSize(new java.awt.Dimension(1200, 600));
        jtxta_observacao.setMinimumSize(new java.awt.Dimension(790, 80));
        jtxta_observacao.setPreferredSize(new java.awt.Dimension(790, 100));
        jscp_jtxta_observacao.setViewportView(jtxta_observacao);

        jPanel1.add(jscp_jtxta_observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1200, 790, 140));

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
        jPanel1.add(jbtn_cadastrarPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1530, 240, 50));

        jtxtf_dtEncerramentoPacote.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_dtEncerramentoPacote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_dtEncerramentoPacote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_dtEncerramentoPacote.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_dtEncerramentoPacote.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_dtEncerramentoPacote.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_dtEncerramentoPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_dtEncerramentoPacoteActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_dtEncerramentoPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 190, -1));

        jlbl_dtEncerramentoPacote.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_dtEncerramentoPacote.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_dtEncerramentoPacote.setText("Data de encerramento");
        jPanel1.add(jlbl_dtEncerramentoPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        jlbl_enderecoPet.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_enderecoPet.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_enderecoPet.setText("Endereço do Pet");
        jPanel1.add(jlbl_enderecoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jtxtf_enderecoPet.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_enderecoPet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_enderecoPet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_enderecoPet.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_enderecoPet.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_enderecoPet.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_enderecoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_enderecoPetActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_enderecoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 410, -1));

        jlbl_dtInicioPacote.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_dtInicioPacote.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_dtInicioPacote.setText("Data de início do pacote");
        jPanel1.add(jlbl_dtInicioPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 180, -1));

        jtxtf_dtInicioPacote.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_dtInicioPacote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_dtInicioPacote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_dtInicioPacote.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_dtInicioPacote.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_dtInicioPacote.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_dtInicioPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_dtInicioPacoteActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_dtInicioPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 190, -1));

        jtxtf_dtAgendada.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_dtAgendada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_dtAgendada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_dtAgendada.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_dtAgendada.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_dtAgendada.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_dtAgendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_dtAgendadaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_dtAgendada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 230, -1));

        jlbl_dtAgendada.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_dtAgendada.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_dtAgendada.setText("Data agendada");
        jPanel1.add(jlbl_dtAgendada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 130, -1));

        jlbl_hrAgendada.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_hrAgendada.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_hrAgendada.setText("Horário agend.");
        jPanel1.add(jlbl_hrAgendada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 110, -1));

        jtxtf_hrAgendada.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_hrAgendada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_hrAgendada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_hrAgendada.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_hrAgendada.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_hrAgendada.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_hrAgendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_hrAgendadaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_hrAgendada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, 120, -1));

        jlbl_servicoAgendado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_servicoAgendado.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_servicoAgendado.setText("Serviço agendado");
        jPanel1.add(jlbl_servicoAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 140, -1));

        jcmb_servicoAgendado.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_servicoAgendado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_servicoAgendado.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_servicoAgendado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Dog Walking", "Pet Sitting", "Consulta veterinária", "Vacina" }));
        jcmb_servicoAgendado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_servicoAgendado.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_servicoAgendado.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_servicoAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 320, -1));

        jcmb_quantidadePacote.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_quantidadePacote.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_quantidadePacote.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_quantidadePacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "1 Semana", "2 Semanas", "1 Mes", "3 Meses", "6 Meses", "1 Ano" }));
        jcmb_quantidadePacote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_quantidadePacote.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_quantidadePacote.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_quantidadePacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 270, -1));

        jlbl_quantidadePacote.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_quantidadePacote.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_quantidadePacote.setText("Quantidade");
        jPanel1.add(jlbl_quantidadePacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 120, -1));

        jcmb_remediosAdicionados.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_remediosAdicionados.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_remediosAdicionados.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_remediosAdicionados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_remediosAdicionados.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_remediosAdicionados.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_remediosAdicionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 930, 330, -1));

        jlbl_remediosAdicionados.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_remediosAdicionados.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_remediosAdicionados.setText("Remédios adicionados");
        jPanel1.add(jlbl_remediosAdicionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 910, 170, -1));

        jlbl_remedio.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_remedio.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_remedio.setText("Remédio");
        jPanel1.add(jlbl_remedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 820, 500, -1));

        jtxtf_remedio.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_remedio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_remedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_remedio.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_remedio.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_remedio.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_remedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_remedioActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_remedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 840, 600, -1));

        jlbl_intrucaoAdministracao.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_intrucaoAdministracao.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_intrucaoAdministracao.setText("Instruções de administração");
        jPanel1.add(jlbl_intrucaoAdministracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 910, 250, -1));

        jtxtf_intrucaoAdministracao.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_intrucaoAdministracao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_intrucaoAdministracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_intrucaoAdministracao.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_intrucaoAdministracao.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_intrucaoAdministracao.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_intrucaoAdministracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_intrucaoAdministracaoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_intrucaoAdministracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 930, 350, -1));

        jtxtf_buscarCom.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_buscarCom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_buscarCom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_buscarCom.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_buscarCom.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_buscarCom.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_buscarCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_buscarComActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_buscarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1430, 330, -1));

        jlbl_devolverPara.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_devolverPara.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_devolverPara.setText("A quem deverá ser devolvido");
        jPanel1.add(jlbl_devolverPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1410, 230, -1));

        jlbl_buscarCom.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_buscarCom.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_buscarCom.setText("Com quem deverá ser buscado");
        jPanel1.add(jlbl_buscarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1410, 280, -1));

        jtxtf_devolverPara.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_devolverPara.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_devolverPara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_devolverPara.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_devolverPara.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_devolverPara.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_devolverPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_devolverParaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_devolverPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1430, 330, -1));

        jlbl_funcionarioAgendado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_funcionarioAgendado.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_funcionarioAgendado.setText("Funcionário agendado");
        jPanel1.add(jlbl_funcionarioAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 160, 20));

        jcmb_funcionarioAgendado.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_funcionarioAgendado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_funcionarioAgendado.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_funcionarioAgendado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Roberto Antônio (35 anos)", "Silvia Rosimary da Costa (28 anos)" }));
        jcmb_funcionarioAgendado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_funcionarioAgendado.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_funcionarioAgendado.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_funcionarioAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 370, -1));

        jlbl_donoPet.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_donoPet.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_donoPet.setText("Dono do Pet");
        jPanel1.add(jlbl_donoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jtxtf_donoPet.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_donoPet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_donoPet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_donoPet.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_donoPet.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_donoPet.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_donoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_donoPetActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_donoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, -1));

        jlbl_localCuidado.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_localCuidado.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_localCuidado.setText("Local do cuidado");
        jPanel1.add(jlbl_localCuidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1080, 130, -1));

        jtxtf_localCuidado.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_localCuidado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_localCuidado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_localCuidado.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_localCuidado.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_localCuidado.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_localCuidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_localCuidadoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_localCuidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1100, 790, -1));

        jlbl_tipoAgendamento.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_tipoAgendamento.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_tipoAgendamento.setText("Tipo do agendamento");
        jPanel1.add(jlbl_tipoAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 160, -1));

        jcmb_tipoAgendamento.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_tipoAgendamento.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_tipoAgendamento.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_tipoAgendamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Único", "Pacote mensal", "Pacote semanal" }));
        jcmb_tipoAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_tipoAgendamento.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_tipoAgendamento.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_tipoAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 270, -1));

        jlbl_horarioRemedio.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_horarioRemedio.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_horarioRemedio.setText("Horário");
        jPanel1.add(jlbl_horarioRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 820, 80, -1));

        jtxtf_horarioRemedio.setBackground(new java.awt.Color(217, 217, 217));
        jtxtf_horarioRemedio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtf_horarioRemedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtf_horarioRemedio.setCaretColor(new java.awt.Color(0, 0, 0));
        jtxtf_horarioRemedio.setMinimumSize(new java.awt.Dimension(250, 50));
        jtxtf_horarioRemedio.setPreferredSize(new java.awt.Dimension(250, 50));
        jtxtf_horarioRemedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_horarioRemedioActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtf_horarioRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 840, 90, -1));

        jcmb_intervalo.setBackground(new java.awt.Color(217, 217, 217));
        jcmb_intervalo.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jcmb_intervalo.setForeground(new java.awt.Color(0, 0, 0));
        jcmb_intervalo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Dias na semana", "Dias no mês", "Semanas no mês" }));
        jcmb_intervalo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jcmb_intervalo.setMinimumSize(new java.awt.Dimension(200, 50));
        jcmb_intervalo.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jcmb_intervalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 280, -1));

        jlbl_aCada.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_aCada.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_aCada.setText("A cada");
        jPanel1.add(jlbl_aCada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 50, -1));

        jspn_aCada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jspn_aCada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 90, 50));

        jlbl_img_adicionarRemedio.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_adicionarRemedio.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_adicionarRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adic remedio.png"))); // NOI18N
        jlbl_img_adicionarRemedio.setText(" ");
        jlbl_img_adicionarRemedio.setToolTipText("");
        jPanel1.add(jlbl_img_adicionarRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        jlbl_intervalo.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_intervalo.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_intervalo.setText("Intervalo");
        jPanel1.add(jlbl_intervalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 100, -1));

        lbl_CadastrarPet1.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        lbl_CadastrarPet1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CadastrarPet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cadastrar agendamento.png"))); // NOI18N
        lbl_CadastrarPet1.setText(" ");
        lbl_CadastrarPet1.setToolTipText("");
        jPanel1.add(lbl_CadastrarPet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jlbl_img_modalidadeAgendamento.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_modalidadeAgendamento.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_modalidadeAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modalidade de agendamento.png"))); // NOI18N
        jlbl_img_modalidadeAgendamento.setText(" ");
        jlbl_img_modalidadeAgendamento.setToolTipText("");
        jPanel1.add(jlbl_img_modalidadeAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jlbl_img_infoAdicionalPet.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_infoAdicionalPet.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_infoAdicionalPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info adicional pet.png"))); // NOI18N
        jlbl_img_infoAdicionalPet.setText(" ");
        jlbl_img_infoAdicionalPet.setToolTipText("");
        jPanel1.add(jlbl_img_infoAdicionalPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1350, -1, -1));

        jlbl_img_linha2.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_linha2.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_linha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        jlbl_img_linha2.setText(" ");
        jlbl_img_linha2.setToolTipText("");
        jPanel1.add(jlbl_img_linha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1050, -1, 10));

        jlbl_img_linha3.setFont(new java.awt.Font("Merriweather", 0, 45)); // NOI18N
        jlbl_img_linha3.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_img_linha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha.png"))); // NOI18N
        jlbl_img_linha3.setText(" ");
        jlbl_img_linha3.setToolTipText("");
        jPanel1.add(jlbl_img_linha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1500, -1, 10));

        jlbl_btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn buscar.png"))); // NOI18N
        jPanel1.add(jlbl_btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jlbl_btnLimparPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn remover pet.png"))); // NOI18N
        jPanel1.add(jlbl_btnLimparPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jlbl_btn_editarRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn editar.png"))); // NOI18N
        jPanel1.add(jlbl_btn_editarRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1000, -1, -1));

        jlbl_btn_adicionarRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn adicionar.png"))); // NOI18N
        jPanel1.add(jlbl_btn_adicionarRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1000, -1, -1));

        jlbl_btn_removerRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn remover.png"))); // NOI18N
        jPanel1.add(jlbl_btn_removerRemedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1000, -1, -1));

        jlbl_passeios.setFont(new java.awt.Font("Merriweather", 0, 15)); // NOI18N
        jlbl_passeios.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_passeios.setText("Passeios");
        jPanel1.add(jlbl_passeios, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 70, -1));

        jspn_passeios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jspn_passeios, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 90, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 1653));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 46, 880, 690));

        jlbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_PADRAO.png"))); // NOI18N
        getContentPane().add(jlbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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

    private void jtxtf_nomePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_nomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_nomePetActionPerformed

    private void jtxtf_dtEncerramentoPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_dtEncerramentoPacoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_dtEncerramentoPacoteActionPerformed

    private void jtxtf_enderecoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_enderecoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_enderecoPetActionPerformed

    private void jtxtf_dtInicioPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_dtInicioPacoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_dtInicioPacoteActionPerformed

    private void jtxtf_dtAgendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_dtAgendadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_dtAgendadaActionPerformed

    private void jtxtf_hrAgendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_hrAgendadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_hrAgendadaActionPerformed

    private void jtxtf_remedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_remedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_remedioActionPerformed

    private void jtxtf_intrucaoAdministracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_intrucaoAdministracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_intrucaoAdministracaoActionPerformed

    private void jtxtf_buscarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_buscarComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_buscarComActionPerformed

    private void jtxtf_devolverParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_devolverParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_devolverParaActionPerformed

    private void jtxtf_donoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_donoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_donoPetActionPerformed

    private void jtxtf_localCuidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_localCuidadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_localCuidadoActionPerformed

    private void jtxtf_horarioRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_horarioRemedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_horarioRemedioActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_cadastrarPet;
    private javax.swing.JComboBox<String> jcmb_funcionarioAgendado;
    private javax.swing.JComboBox<String> jcmb_intervalo;
    private javax.swing.JComboBox<String> jcmb_quantidadePacote;
    private javax.swing.JComboBox<String> jcmb_remediosAdicionados;
    private javax.swing.JComboBox<String> jcmb_servicoAgendado;
    private javax.swing.JComboBox<String> jcmb_tipoAgendamento;
    private javax.swing.JComboBox<String> jcmb_tipoServico;
    private javax.swing.JLabel jlbl_aCada;
    private javax.swing.JLabel jlbl_background;
    private javax.swing.JLabel jlbl_btnBuscar;
    private javax.swing.JLabel jlbl_btnLimparPet;
    private javax.swing.JLabel jlbl_btn_adicionarRemedio;
    private javax.swing.JLabel jlbl_btn_editarRemedio;
    private javax.swing.JLabel jlbl_btn_removerRemedio;
    private javax.swing.JLabel jlbl_buscarCom;
    private javax.swing.JLabel jlbl_devolverPara;
    private javax.swing.JLabel jlbl_donoPet;
    private javax.swing.JLabel jlbl_dtAgendada;
    private javax.swing.JLabel jlbl_dtEncerramentoPacote;
    private javax.swing.JLabel jlbl_dtInicioPacote;
    private javax.swing.JLabel jlbl_enderecoPet;
    private javax.swing.JLabel jlbl_funcionarioAgendado;
    private javax.swing.JLabel jlbl_horarioRemedio;
    private javax.swing.JLabel jlbl_hrAgendada;
    private javax.swing.JLabel jlbl_img_adicionarRemedio;
    private javax.swing.JLabel jlbl_img_infoAdicionalPet;
    private javax.swing.JLabel jlbl_img_linha1;
    private javax.swing.JLabel jlbl_img_linha2;
    private javax.swing.JLabel jlbl_img_linha3;
    private javax.swing.JLabel jlbl_img_modalidadeAgendamento;
    private javax.swing.JLabel jlbl_intervalo;
    private javax.swing.JLabel jlbl_intrucaoAdministracao;
    private javax.swing.JLabel jlbl_localCuidado;
    private javax.swing.JLabel jlbl_nomePet;
    private javax.swing.JLabel jlbl_observacao;
    private javax.swing.JLabel jlbl_passeios;
    private javax.swing.JLabel jlbl_quantidadePacote;
    private javax.swing.JLabel jlbl_remedio;
    private javax.swing.JLabel jlbl_remediosAdicionados;
    private javax.swing.JLabel jlbl_servicoAgendado;
    private javax.swing.JLabel jlbl_tipoAgendamento;
    private javax.swing.JLabel jlbl_tipoServico;
    private javax.swing.JScrollPane jscp_jtxta_observacao;
    private javax.swing.JSpinner jspn_aCada;
    private javax.swing.JSpinner jspn_passeios;
    private javax.swing.JTextArea jtxta_observacao;
    private javax.swing.JTextField jtxtf_buscarCom;
    private javax.swing.JTextField jtxtf_devolverPara;
    private javax.swing.JTextField jtxtf_donoPet;
    private javax.swing.JTextField jtxtf_dtAgendada;
    private javax.swing.JTextField jtxtf_dtEncerramentoPacote;
    private javax.swing.JTextField jtxtf_dtInicioPacote;
    private javax.swing.JTextField jtxtf_enderecoPet;
    private javax.swing.JTextField jtxtf_horarioRemedio;
    private javax.swing.JTextField jtxtf_hrAgendada;
    private javax.swing.JTextField jtxtf_intrucaoAdministracao;
    private javax.swing.JTextField jtxtf_localCuidado;
    private javax.swing.JTextField jtxtf_nomePet;
    private javax.swing.JTextField jtxtf_remedio;
    private javax.swing.JLabel lbl_CadastrarPet1;
    // End of variables declaration//GEN-END:variables
}
