/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petagenda;

import Interfaces.TELA_LOGIN;
import Interfaces.Tela_Inicial;
import Interfaces.Tela_de_visualizacao_do_mes;
import Interfaces.Tela_visualizacao_cliente;
import Interfaces.Tela_visualizacao_funcionario;
import Interfaces.Tela_visualizacao_pet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ncunha
 */
public class MenuPanel extends JPanel {

    private JToggleButton btn_Home;
    private JButton btn_agenda, btn_financeiro, btn_clientes, btn_funcionarios, btn_pets, btn_config, btn_sair;

    public MenuPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(new Color(124, 115, 101));
        setPreferredSize(new Dimension(205, 768));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home = new JToggleButton(new ImageIcon(getClass().getResource("/logo_PetAgendaMenor.png")));
        btn_Home.setBackground(new Color(124, 115, 101));
        btn_Home.setBorder(null);
        btn_Home.setBorderPainted(false);
        btn_Home.setContentAreaFilled(false);
        btn_Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn_Home.setFocusPainted(false);
        btn_Home.setPressedIcon(new ImageIcon(getClass().getResource("/logo_PetAgendaPressed.png")));
        btn_Home.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                btn_HomeMousePressed(evt);
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                btn_HomeMouseReleased(evt);
            }
        });
        btn_Home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        btn_agenda = createButton("Agenda", "/icon_agenda.png");
        btn_agenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_agendaActionPerformed(evt);
            }
        });
        btn_agenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_agendaPetMouseMoved(evt);
            }
        });
        btn_agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agendaPetMouseExited(evt);
            }
        });
        
        btn_financeiro = createButton("Financeiro", "/icon_financeiro.png");
        btn_financeiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_financeiroActionPerformed(evt);
            }
        });
        btn_financeiro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_financeiroPetMouseMoved(evt);
            }
        });
        btn_financeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_financeiroPetMouseExited(evt);
            }
        });
        
        btn_clientes = createButton("Clientes", "/icon_clientes.png");
        btn_clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        btn_clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        btn_clientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_clientesPetMouseMoved(evt);
            }
        });
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesPetMouseExited(evt);
            }
        });

        btn_funcionarios = createButton("Funcionários", "/icon_funcionario.png");
        btn_funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_funcionariosActionPerformed(evt);
            }
        });
        btn_funcionarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_funcionariosPetMouseMoved(evt);
            }
        });
        btn_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_funcionariosPetMouseExited(evt);
            }
        });

        btn_pets = createButton("Pets", "/icon_pets.png");
        btn_pets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_petsActionPerformed(evt);
            }
        });
        btn_pets.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_petsPetMouseMoved(evt);
            }
        });
        btn_pets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_petsPetMouseExited(evt);
            }
        });

        btn_config = createButton("Configurações", "/icon_configuracoes.png");
        btn_config.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_configActionPerformed(evt);
            }
        });
        btn_config.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_configPetMouseMoved(evt);
            }
        });
        btn_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_configPetMouseExited(evt);
            }
        });
        
        btn_sair = createButton("Sair", "/icon_sair.png");
        btn_sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        btn_sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_sairPetMouseMoved(evt);
            }
        });
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sairPetMouseExited(evt);
            }
        });
                
        add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 193, -1));
        add(btn_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 205, 60));
        add(btn_financeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 205, 60));
        add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 368, 205, 60));
        add(btn_funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 428, 205, 60));
        add(btn_pets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 205, 60));
        add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 548, 205, 60));
        add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 608, 205, 60));

        
        
    }

    private JToggleButton createToggleButton(String iconPath, String pressedIconPath) {
        JToggleButton button = new JToggleButton(new ImageIcon(getClass().getResource(iconPath)));
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setPressedIcon(new ImageIcon(getClass().getResource(pressedIconPath)));
        return button;
    }

    private JButton createButton(String text, String iconPath) {
        JButton button = new JButton(text, new ImageIcon(getClass().getResource(iconPath)));
        button.setFont(new Font("Merriweather", Font.PLAIN, 14));
        button.setForeground(Color.WHITE);
        button.setBorder(null);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setIconTextGap(8);
        button.setPreferredSize(new Dimension(205, 60));
        return button;
    }

    private void btn_HomeMousePressed(MouseEvent evt) {

    }

    private void btn_HomeMouseReleased(MouseEvent evt) {

    }

    

    private void btn_HomeActionPerformed(ActionEvent evt) {
        Tela_Inicial telaPrincipal = new Tela_Inicial();
        telaPrincipal.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btn_agendaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Tela_de_visualizacao_do_mes telaVisualizaMes = new Tela_de_visualizacao_do_mes();
        telaVisualizaMes.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    private void btn_agendaPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_agenda.setOpaque(true);
        btn_agenda.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_agendaPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_agenda.setOpaque(false);
    } 
    
    //Botão Financeiro
    private void btn_financeiroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void btn_financeiroPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_financeiro.setOpaque(true);
        btn_financeiro.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_financeiroPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_financeiro.setOpaque(false);
    }
    
    //Botão Clientes
    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {
        Tela_visualizacao_cliente telaCliente = new Tela_visualizacao_cliente();
        telaCliente.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    private void btn_clientesPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_clientes.setOpaque(true);
        btn_clientes.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_clientesPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_clientes.setOpaque(false);
    }
    
    //Botão Funcionários
    private void btn_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {
        Tela_visualizacao_funcionario telaFunc = new Tela_visualizacao_funcionario();
        telaFunc.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    private void btn_funcionariosPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_funcionarios.setOpaque(true);
        btn_funcionarios.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_funcionariosPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_funcionarios.setOpaque(false);
    }
    
    //Botão Pets
    private void btn_petsActionPerformed(ActionEvent evt) {
        Tela_visualizacao_pet telaPets = new Tela_visualizacao_pet();
        telaPets.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    private void btn_petsPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_pets.setOpaque(true);
        btn_pets.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_petsPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_pets.setOpaque(false);
    }
    
    //Botão Configurações
    private void btn_configActionPerformed(ActionEvent evt) {
        //TODO add your handling code here:
    }
    private void btn_configPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_config.setOpaque(true);
        btn_config.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_configPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_config.setOpaque(false);
    }
    
    //Botão Sair
    private void btn_sairActionPerformed(ActionEvent evt) {
        TELA_LOGIN telaLogin = new TELA_LOGIN();
        telaLogin.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }
    private void btn_sairPetMouseMoved(java.awt.event.MouseEvent evt) {
        btn_sair.setOpaque(true);
        btn_sair.setBackground(new java.awt.Color(99, 90, 77));
    }
    private void btn_sairPetMouseExited(java.awt.event.MouseEvent evt) {                                              
        btn_sair.setOpaque(false);
    }
}
