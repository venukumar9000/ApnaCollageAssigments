package org.example.openclosedprinciple;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Shape shape= new Circle(5);
        Shape shape1= new Rectangle(2,5);

        System.out.println("area of circle :"+shape.area());
        System.out.println("area of rectangle :"+shape1.area());
    }
}
