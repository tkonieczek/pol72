package pl.pol72.dzien2;

public abstract class Shape {

    protected String color;
    protected boolean isFilled;

    public Shape() {
        color = "unknown";
        isFilled = false; // mozemy ale nie musimy
    }

    public abstract void draw();

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
//Shape with color of ? and filled/NotFilled
    @Override
    public String toString() {
        return "Shape with color of " + color + " and "
                + (isFilled ? "filled" : "NotFilled");
    }
}
