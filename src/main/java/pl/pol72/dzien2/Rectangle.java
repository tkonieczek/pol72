package pl.pol72.dzien2;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        super(); // jest ale nie mu być, bo jesli nie bedzie
        // to kompilator sam sobie doda
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public boolean isTwoTimesBigger(Rectangle rectangle) {
        //lamerskie
/*        if(this.width ==  2 * rectangle.width && this.length == 2 * rectangle.length) {
            return true;
        } else {
            return false;
        }*/
        return this.width == 2 * rectangle.width && this.length == 2 * rectangle.length;
    }

    public double getArea() {
        System.out.println("Jestem PROSTOKATEM");
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void draw() {
        System.out.println("RYSUJE PROSTOKAT");
    }

    //Rectangle with width=? and length=? which is a subclass
    //off y
    @Override
    public String toString() {
        return "Rectange with width=" + width +
                "and length=" + length +
                "which is a subclass off " + super.toString();
    }

    public void metodaProstokat() {
        System.out.println("fasdfads");
    }
}
