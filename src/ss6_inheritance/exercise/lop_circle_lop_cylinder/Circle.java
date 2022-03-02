package ss6_inheritance.exercise.lop_circle_lop_cylinder;

public class Circle {
    private double radius =1.0;
    private String color = "blue";

    Circle(){
    }
    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
            return "A Circle with radius = "
                    + getRadius()
                    +", has area = "
                    + getArea()
                    + ", which colored "
                    + getColor();
    }
}
