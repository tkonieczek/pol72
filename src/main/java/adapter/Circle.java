package adapter;

public class Circle {

    double r; // jakas zmiana

    public Circle(double r) {
        this.r = r;
    }

    public void printShape() {
        System.out.println("Circle");
    }

    public double calculateCircumference(){
        return 2 * Math.PI * r;
    }
}
