package adapter;

public class Triangle implements Shape {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("-----------");
    }
    @Override
    public double getCircumference() {
        return a + b + c;
    }

}
