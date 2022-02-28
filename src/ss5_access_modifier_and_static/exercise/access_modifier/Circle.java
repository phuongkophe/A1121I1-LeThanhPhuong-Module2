package ss5_access_modifier_and_static.exercise.access_modifier;

public class Circle {
     double radius = 1.0;
     String color = "red";

    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*(3.14);
    }
}
