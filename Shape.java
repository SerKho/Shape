package Shape;

import com.sun.prism.Graphics;

/**
 * Created by 777 on 12.03.2016.
 */
public class Shape {
    public void draw(java.awt.Graphics g){
                throw new IllegalStateException("I don't know what shape I have to draw.");
    }

    public void undraw(){
        System.out.println("Shape was erased.");
    }
}
