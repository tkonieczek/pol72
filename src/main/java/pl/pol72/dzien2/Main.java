package pl.pol72.dzien2;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle();

        if(shape instanceof Rectangle) {
            Rectangle rec = (Rectangle) shape;
            rec.metodaProstokat();
        }
    }
}
