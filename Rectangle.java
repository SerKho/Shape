package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Rectangle extends Shape {
    public Rectangle(Color color, int stroke){
        this.color = color;
        this.stroke = stroke;
    }
    @Override
    public void draw(java.awt.Graphics g) {
        ((Graphics2D)g).setStroke(new BasicStroke(stroke));
        g.setColor(color);
        g.drawRect(200, 50, 80, 60);
        g.fillRect(200, 120, 80, 60);
        System.out.println("Rectangle was drawn.");
    }
}
