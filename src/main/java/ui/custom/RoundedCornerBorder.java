/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.custom;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Nata e Julia
 */
public class RoundedCornerBorder extends AbstractBorder {
    
    private final int radius;
    private static final Color ALPHA_ZERO = new Color(0x0, true);
    private final Color borderColor = Color.BLACK;
    private final int thickness = 2;
    
    public RoundedCornerBorder(int radius) {
        this.radius = radius;
    }

    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (c.getParent() != null) {
            Color bc = g.getColor();
            g.setColor(c.getParent().getBackground());
            for (int r = 0; r < radius; r++) {
                g.drawRoundRect(x, y, width - 1, height - 1, r, r);
            }
            g.setColor(bc);
        }
        graphics.setStroke(new BasicStroke(thickness));
        g.setColor(borderColor);
        graphics.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }

    public Shape getBorderShape(int x, int y, int w, int h) {
        int r = h; // Raio da borda
        return new RoundRectangle2D.Double(x, y, w, h, r, r);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness, thickness, thickness, thickness);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(thickness, thickness, thickness, thickness);
        return insets;
    }

    public static void main(String[] args) {
        // Cria um JFrame para testar o JTextField com bordas arredondadas
        JFrame frame = new JFrame("Test Rounded JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField02 = new JTextField(20) {
            @Override
            protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                            0, 0, getWidth() - 1, getHeight() - 1));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override
            public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder(50));
                setBackground(new Color(0xD9D9D9)); // Define a cor de fundo D9D9D9
            }
        };

        textField02.setPreferredSize(new Dimension(200, 40));
        frame.add(textField02);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
