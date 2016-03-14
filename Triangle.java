package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Triangle extends Shape {

    public Triangle(Color color, int stroke){
        this.color = color;
        this.stroke = stroke;
    }
    @Override
    public void draw(java.awt.Graphics g) {
        int[]x = new int[]{450, 500, 400}; int[]y = new int[]{10, 100, 100};
        int[]x1 = new int[]{450, 500, 400}; int[]y1 = new int[]{110, 200, 200};
        g.setColor(color);
        ((Graphics2D)g).setStroke(new BasicStroke(stroke));
        g.drawPolygon(x, y, 3);
        g.fillPolygon(x1, y1, 3);
        System.out.println("Triangle was drawn.");
    }
}
