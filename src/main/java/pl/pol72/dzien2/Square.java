package pl.pol72.dzien2;

public class Square extends Rectangle {

    public Square(double size) {
        this.width = size;
        this.length = size;
    }
//String color, boolean isFilled, double width, double length
    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
/*        this.color = color;
        this.isFilled = isFilled;
        this.width = size;
        this.length = size;*/
    }

    @Override
    public double getArea() {
        System.out.println("Jestem KWADRATEM");
        return width * length;
    }

    public void jestemSuperMetodaKwadratu() {

    }


    public void draw() {
        System.out.println("RYSUJE KWADRAT");
    }
}
