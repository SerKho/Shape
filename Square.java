package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Square extends Rectangle {
    @Override
    public void draw(Graphics g) {
        g.setColor(new java.awt.Color(105, 100, 200));
        g.fillRect(200, 260, 80, 60);
        System.out.println("Square was drawn.");
    }
}
