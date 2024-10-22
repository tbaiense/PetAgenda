
package ui.custom;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;


public class RoundedCornerBorder extends AbstractBorder {
    
    private final int radius;
    private final Color borderColor = Color.BLACK;
    private final int thickness = 2;

    public RoundedCornerBorder(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
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
        int value = getRadius() / 2;
        return new Insets(value, value, value, value);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(thickness, thickness, thickness, thickness);
        return insets;
    }
}