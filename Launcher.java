package Shape;

/**
 * Created by 777 on 12.03.2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Shape s = new Circle();

        shape.draw();
        circle.draw();
        triangle.draw();
        rectangle.draw();
        s.draw();
    }
}
