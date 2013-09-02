package drawcircle;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class DrawCircle extends JApplet {

    private double radius;

    public void paint(Graphics g) {

        double w = getWidth();
        double h = getHeight();
        super.paint(g);
        g.drawOval(0, 0, (int) w / 2, (int) h / 2);

        double x1 = radius;
        double y1 = 0;
        double b = 2 * radius * Math.sin(Math.PI / 3);
        double x2 = x1 + b * Math.cos(Math.PI / 3);
        double y2 = y1 + b * Math.sin(Math.PI / 3);
        double x3 = x1 + b * Math.cos(Math.PI / 3);
        double y3 = y2;
                g.setColor(Color.BLUE);
                

    }
}
