//*************************************************************************
//Week 13 - Practice Assignment
//Circle.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Circle class models a circle with a radius
//*************************************************************************

public class Circle extends Shape{
    // private instance variable, not accessible from outside this class
    private double radius;

    public Circle() { // 1st (default) constructor
        radius = 1.0;
    }

    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        String phrase;
        phrase = "\nA Circle with radius=" + radius + ", which is a subclass of " + super.toString();
        return phrase;
    }
}
