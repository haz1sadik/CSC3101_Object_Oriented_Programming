package Lab4_Week6_7.Q2;
import java.lang.Math;
public class Circle extends TwoDimensional{
    private double radius;
    public Circle(double radius, int numOfSides, String color){
        super(numOfSides, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return pi * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "\nCircle\n" + super.toString() + "\nRadius : " + getRadius() + "\nArea : " + calcArea();
    }
}
