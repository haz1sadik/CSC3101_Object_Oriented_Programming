package Lab4_Week6_7.Q2;

public class Triangle extends TwoDimensional{
    private double height, length;
    public Triangle(double height, double length, int numOfSides, String color){
        super(numOfSides, color);
        setHeight(height);
        setLength(length);
    }

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

    @Override
    public double calcArea() {
        return (getHeight()*getLength())/2;
    }

    @Override
    public String toString() {
        return "\nTriangle\n" + super.toString() + "\nArea : " + calcArea();
    }
}

