package adapter;

public class Main {


    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        Shape square = new Square(2);
        Shape triangle = new Triangle(6,4,8);
        Circle circle = new Circle(5);
        CircleAdapter circleAdapter = new CircleAdapter(circle);

        shapeManager.addShape(square);
        shapeManager.addShape(triangle);
        shapeManager.addShape(circleAdapter);

        shapeManager.drawAllShapes();
        shapeManager.printAllCircumferences();
    }
}
