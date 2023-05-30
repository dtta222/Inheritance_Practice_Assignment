//*************************************************************************
//Week 13 - Practice Assignment
//Rectangle.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Rectangle class models a rectangle with a length and width
//*************************************************************************

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }

    public String toString() {
        String phrase;
        phrase = "A Rectangle with width=" + width + " and length="
                + length + ", which is a subclass of" + super.toString();
        return phrase;
    }
}
