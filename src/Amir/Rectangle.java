package Amir;
/* Name : Amir Syarifuddin
   Course : Computer Network
   Matric Number : 224300*/
public class Rectangle {
    private double length;
    private double width;
    private static int noOfObj = 0;

    //constructor
    public Rectangle() {
        width = 1.0;
        length = 1.0;
        noOfObj++;
    }

    public Rectangle(double length, double width) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Width and length must be positive.");
        }
        this.length = length;
        this.width = width;
        noOfObj++;
    }
    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    //display method
    public void displayAreaPerimeter() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static int getNoOfObj() {
        return noOfObj;
    }

    @Override
    public String toString() {
        return "Rectangle [length = " + length + ", width = " + width + " ]";
    }
}