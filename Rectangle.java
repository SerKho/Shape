package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Rectangle extends Shape {
    @Override
    public void draw(java.awt.Graphics g) {
        ((Graphics2D)g).setStroke(new BasicStroke(5.0f));
        g.setColor(new java.awt.Color(0, 25, 115));
        g.drawRect(200, 50, 80, 60);
        g.setColor(new java.awt.Color(105, 14, 25));
        g.fillRect(200, 120, 80, 60);
        System.out.println("Rectangle was drawn.");
    }
}
