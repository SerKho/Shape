package Shape;

import java.awt.*;

/**
 * Created by 777 on 12.03.2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Circle((Color.blue), 10);
        s[1] = new Triangle((Color.red), 5);
        s[2] = new Rectangle((Color.gray), 15);
        s[3] = new Square(Color.CYAN, 20);

        ShapesTemplate a = new ShapesTemplate(s);
      }
}
