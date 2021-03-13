package adapter;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

    List<Shape> list;

    public ShapeManager() {
        list = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        list.add(shape);
    }

    public void drawAllShapes() {
        for (Shape shape : list) {
            shape.draw();
        }
    }

    public void printAllCircumferences() {
        for (Shape shape : list) {
            System.out.println(shape.getCircumference());
        }

    }
}