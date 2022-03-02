package ss6_inheritance.exercise.lop_point_va_moveable_point;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point() {
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
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
    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }
    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "In point"
                +" coordinates of x: " +this.x
                + " coordinates of y: " +this.y;
    }
}
