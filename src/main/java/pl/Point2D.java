package pl;

public class Point2D {

    protected float x;
    protected float y;

    public Point2D() {
        // nie musze tego robic
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] coordinates = new float[]{x, y};
        //float[] coordinates2 = {x, y};

        //coordinates[0] = x;
        //coordinates[1] = y;
        return coordinates;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
