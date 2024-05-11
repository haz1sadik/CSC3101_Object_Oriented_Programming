package Lab4_Week6_7.Q2;
//Triangle is a child class from superclass TwoDimensional
public class Triangle extends TwoDimensional{
    //attributes declarations
    private double height, length;
    public Triangle(double height, double length, int numOfSides, String color){
        super(numOfSides, color);
        setHeight(height);
        setLength(length);
    }
    //Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Method to calculate area of a triangle
    @Override
    public double calcArea() {
        return (getHeight()*getLength())/2;
    }

    @Override
    public String toString() {
        return "\nTriangle\n" + super.toString() + "\nArea : " + calcArea();
    }
}

