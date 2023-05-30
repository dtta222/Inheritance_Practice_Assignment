//*************************************************************************
//Week 13 - Practice Assignment
//TestShape.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: A Test Driver for the Shape program
//*************************************************************************
public class TestShape {
    public static void main(String[] args) {

        // test constructor 1
        Shape shape1 = new Shape();
        System.out.println("\n----- Testing Default Constructor -----");
        System.out.println("\nPrinting object named shape1" + shape1);

        // test constructor 2
        System.out.println("\n\n----- Testing Constructor with Parameters -----");
        Shape shape2 = new Shape("red", true);
        System.out.println("\nPrinting object named shape2" + shape2);

        // test getColor and isFilled
        Shape shape3 = new Shape("blue", true);
        System.out.println("\n\n----- Testing Getters -----");
        System.out.println("\nPrinting object named shape3");
        System.out.println("shape3 color: " + shape3.getColor());
        System.out.println("shape3 fill: " + shape3.isFilled());

        // test setters
        System.out.println("\n\n----- Testing Setters -----");
        shape3.setColor("yellow");
        shape3.setFilled(false);

        // test toString for shape class
        System.out.println("\nPrinting object named shape3" + shape3.toString());

        // test toString for circle class
        System.out.println("\n\n----- Testing Circle toString -----");
        Circle circle1 = new Circle(1.5,"red", true);
        System.out.println("\nPrinting object named circle1. " + circle1.toString());

        System.out.println("\n\n----- Testing Rectangle toString -----");
        Rectangle rect1 = new Rectangle(5,8, "red", true);
        System.out.println("\nPrinting object named rect1. " + rect1.toString());

        System.out.println("\n\n----- Testing Square toString -----");
        Square square1 = new Square(5, "blue", true);
        System.out.println("\nPrinting object named square1. " + square1.toString());
    }
}