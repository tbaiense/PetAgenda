/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.custom;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nata e Julia
 */
public class RoundedCornerButtonUI extends BasicButtonUI {
    private static final float arcwidth  = 40.0f;  // Raio horizontal dos cantos
    private static final float archeight = 40.0f;  // Raio vertical dos cantos
    protected static final int focusstroke = 2;
    protected final Color fc = new Color(71, 120, 63);  // Cor para foco
    protected final Color ac = new Color(77, 230, 63);  // Cor aumentada em 50% de brilho
    protected final Color rc = new Color(71, 140, 63);  // Cor para rollover
    protected Shape shape;
    protected Shape base;

    @Override protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        b.setContentAreaFilled(false);
        b.setOpaque(false);
        initShape(b);
    }

    @Override protected void installListeners(AbstractButton b) {
        BasicButtonListener listener = new BasicButtonListener(b) {
            @Override public void mousePressed(MouseEvent e) {
                AbstractButton b = (AbstractButton) e.getSource();
                initShape(b);
                if(shape.contains(e.getX(), e.getY())) {
                    super.mousePressed(e);
                }
            }
            @Override public void mouseEntered(MouseEvent e) {
                AbstractButton b = (AbstractButton) e.getSource();
                if(shape.contains(e.getX(), e.getY())) {
                    super.mouseEntered(e);
                }
            }
            @Override public void mouseMoved(MouseEvent e) {
                AbstractButton b = (AbstractButton) e.getSource();
                if(shape.contains(e.getX(), e.getY())) {
                    super.mouseEntered(e);
                } else {
                    super.mouseExited(e);
                }
            }
        };
        if(listener != null) {
            b.addMouseListener(listener);
            b.addMouseMotionListener(listener);
            b.addFocusListener(listener);
            b.addPropertyChangeListener(listener);
            b.addChangeListener(listener);
        }
    }

    @Override public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g;
        AbstractButton b = (AbstractButton) c;
        ButtonModel model = b.getModel();
        initShape(b);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cor padrão do botão
        Color buttonColor = new Color(51, 153, 0);  // Verde

        // Desenha o fundo do botão
        if (model.isArmed()) {
            g2.setColor(ac);  // Cor quando o botão está pressionado
        } else if (b.isRolloverEnabled() && model.isRollover()) {
            g2.setColor(rc);  // Cor de rollover
        } else if (b.hasFocus()) {
            g2.setColor(fc);  // Cor quando o botão tem foco
        } else {
            g2.setColor(buttonColor);  // Cor padrão do botão (verde)
        }

        g2.fill(shape);  // Preenche a forma do botão

        // Desenha a borda com a mesma forma arredondada
        g2.setColor(Color.BLACK);  // Cor da borda
        g2.setStroke(new BasicStroke(focusstroke));  // Define a espessura da borda
        g2.draw(shape);  // Desenha a borda

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        super.paint(g2, c);
    }

    private void initShape(JComponent c) {
        if (!c.getBounds().equals(base)) {
            base = c.getBounds();
            shape = new RoundRectangle2D.Float(0, 0, c.getWidth() - 1, c.getHeight() - 1, arcwidth, archeight);
        }
    }
}
