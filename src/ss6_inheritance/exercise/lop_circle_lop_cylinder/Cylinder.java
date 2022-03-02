package ss6_inheritance.exercise.lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    Cylinder() {
    }
    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*(getRadius()*2)*height;
    }
    @Override
    public String toString() {
        return "A Cylinder with radius= "
                + getRadius()
                + ", and height"
                + getHeight()
                +", has area = "
                + getArea()
                + ", which colored "
                + getColor();
    }
}
