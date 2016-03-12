package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Triangle extends Shape {
    @Override
    public void draw(java.awt.Graphics g) {
        int[]x = new int[]{450, 500, 400}; int[]y = new int[]{10, 100, 100};
        int[]x1 = new int[]{450, 500, 400}; int[]y1 = new int[]{110, 200, 200};
        g.setColor(new java.awt.Color(255, 100, 100));
        ((Graphics2D)g).setStroke(new BasicStroke(12.0f));
        g.drawPolygon(x, y, 3);
        g.setColor(new java.awt.Color(255, 0, 255));

        g.fillPolygon(x1, y1, 3);
        System.out.println("Triangle was drawn.");
    }
}
