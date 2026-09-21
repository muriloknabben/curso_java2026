package main.java.com.ep1.model;

public class Rectangle {
    
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }
}