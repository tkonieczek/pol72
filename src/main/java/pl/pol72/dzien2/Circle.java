package pl.pol72.dzien2;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super(); // jest ale nie mu być, bo jesli nie bedzie
        // to kompilator sam sobie doda
        radius = 1;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }


    public void draw() {
        System.out.println("RYSUJE KOLKO");
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Circle with radius=? which is a subclass off y
    @Override
    public String toString() {
        return "Circle with radius=" + radius +
                "which is a subclass off " + super.toString();
    }
}
