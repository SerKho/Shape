package Shape;

/**
 * Created by 777 on 12.03.2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Circle();
        s[1] = new Triangle();
        s[2] = new Rectangle();


        ShapesTemplate a = new ShapesTemplate(s);
    }
}
