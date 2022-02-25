package ss4_class_and_oop.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    //    double a,b,c;
    private double a, b, c, delta, root1, root2 = 0;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c, double delta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * 2 - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c) / 2 * a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c) / 2 * a);
        return root2;
    }

    public static void main(String[] args) {
        System.out.println("Quadratic Equation: ax^2 + bx + c ");
        System.out.println("Enter a:");
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation a = new QuadraticEquation();
        a.setA(scanner.nextDouble());
        System.out.println("Enter b:");
        Scanner scanner1 = new Scanner(System.in);
        QuadraticEquation b = new QuadraticEquation();
        b.setB(scanner.nextDouble());
        System.out.println("Enter C:");
        Scanner scanner2 = new Scanner(System.in);
        QuadraticEquation c = new QuadraticEquation();
        c.setC(scanner.nextDouble());
        QuadraticEquation delta = new QuadraticEquation();
        QuadraticEquation root1 = new QuadraticEquation();
        QuadraticEquation root2 = new QuadraticEquation();
        if (delta.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " +root1.getRoot1()+ "" + root2.getRoot2());
        }else if (delta.getDiscriminant() == 0){
            
        }
    }
}
