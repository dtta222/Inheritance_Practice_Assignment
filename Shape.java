//*************************************************************************
//Week 13 - Practice Assignment
//Shape.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Shape class for the Shape program
//*************************************************************************
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "none";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String fill;
        if (filled == true) {
            fill = "filled";
        } else {
            fill = "not filled";
        }
        String phrase;
        phrase = "\nA shape with a color of " + color + " and " + fill;
        return phrase;
    }
}
