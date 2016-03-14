package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Square extends Rectangle {

    public Square(Color color, int stoke){
        super(color,stoke);
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(200, 260, 80, 80);
        System.out.println("Square was drawn.");
    }
}
