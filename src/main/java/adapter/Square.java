package adapter;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void draw() {
        System.out.println("---------------");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("---------------");
    }

    @Override
    public double getCircumference() {
        return 4 * a;
    }
}
