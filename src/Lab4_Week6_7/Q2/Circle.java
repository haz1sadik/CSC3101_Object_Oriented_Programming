package Lab4_Week6_7.Q2;
import java.lang.Math;
//Circle is a child class from superclass TwoDimensional
public class Circle extends TwoDimensional{
    //attributes declarations
    private double radius;
    public Circle(double radius, int numOfSides, String color){
        super(numOfSides, color);
        setRadius(radius);
    }
    //Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Method to calculate Area of a circle
    public double calcArea(){
        return pi * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "\nCircle\n" + super.toString() + "\nRadius : " + getRadius() + "\nArea : " + calcArea();
    }
}
