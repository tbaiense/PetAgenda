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
        btn_Home.setPressedIcon(new ImageIcon(getClass().getResource("/logo_PetAgendaPressed.png"))); // Ícone quando pressionado

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

        btn_financeiro = createButton("Financeiro", "/icon_financeiro.png");

        btn_clientes = createButton("Clientes", "/icon_clientes.png");
        btn_clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_funcionarios = createButton("Funcionários", "/icon_funcionario.png");
        btn_funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_funcionariosActionPerformed(evt);
            }
        });

        btn_pets = createButton("Pets", "/icon_pets.png");
        btn_pets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_petsActionPerformed(evt);
            }
        });

        btn_config = createButton("Configurações", "/icon_configuracoes.png");
        btn_sair = createButton("Sair", "/icon_sair.png");

        add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 193, -1));
        add(btn_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 205, 60));
        add(btn_financeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 205, 60));
        add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 368, 205, 60));
        add(btn_funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 428, 205, 60));
        add(btn_pets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 205, 60));
        add(btn_config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 548, 205, 60));
        add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 608, 205, 60));

        btn_Home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        btn_sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
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

    private void btn_petsActionPerformed(ActionEvent evt) {
        Tela_visualizacao_pet telaPets = new Tela_visualizacao_pet();
        telaPets.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
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

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {
        Tela_visualizacao_cliente telaCliente = new Tela_visualizacao_cliente();
        telaCliente.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btn_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {
        Tela_visualizacao_funcionario telaFunc = new Tela_visualizacao_funcionario();
        telaFunc.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btn_sairActionPerformed(ActionEvent evt) {
        TELA_LOGIN telaLogin = new TELA_LOGIN();
        telaLogin.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }

}
