package Shape;


import com.sun.prism.Graphics;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Circle extends Shape {
    public Circle(Color color, int stroke){
        this.color = color;
        this.stroke = stroke;
    }
    @Override
    public void draw(java.awt.Graphics g) {
        ((Graphics2D)g).setStroke(new BasicStroke(stroke));
        g.setColor(color);
        g.drawOval(100, 50, 80, 80);
        g.fillOval(100, 150, 80, 80);
        System.out.println("Circle was drawn.");
    }
}

