package Shape;

import NaZakreplenie.Color;
import com.sun.prism.Graphics;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Circle extends Shape {
    @Override
    public void draw(java.awt.Graphics g) {
        ((Graphics2D)g).setStroke(new BasicStroke(10.0f));
        g.setColor(new java.awt.Color(252, 255, 0));
        g.drawOval(100, 50, 80, 80);
        g.setColor(new java.awt.Color(0, 255, 255));
                g.fillOval(100, 150, 80, 80);

        System.out.println("Circle was drawn.");
    }
}

