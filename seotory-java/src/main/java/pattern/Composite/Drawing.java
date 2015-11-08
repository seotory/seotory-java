package pattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zion437 on 2015. 11. 8..
 */
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void draw (String fillColor) {
        for ( Shape sh : shapes ) {
            sh.draw(fillColor);
        }
    }

    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape s) {
        shapes.remove(s);
    }

    public void clear() {
        System.out.println("Clearing all this shapes from drawing");
        this.shapes.clear();
    }
}
