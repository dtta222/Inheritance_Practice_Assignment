//*************************************************************************
//Week 13 - Practice Assignment
//Square.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Square class models a square with a length and width
//*************************************************************************

public class Square extends Rectangle {

    private double side;
    public Square() {
        side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String toString() {
        String phrase;
        phrase = "A Square with side=" + side + ", which is a subclass of " + super.toString();
        return phrase;
    }
}
