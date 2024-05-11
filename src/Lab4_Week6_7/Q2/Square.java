package Lab4_Week6_7.Q2;
//Square is a child class from superclass TwoDimensional
public class Square extends TwoDimensional{
    //attributes declarations
    private double length;
    public Square(double length, int numOfSides, String color){
        super(numOfSides, color);
        setLength(length);
    }
    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Method to calculate Area of a Square
    @Override
    public double calcArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return "\nSquare\n" + super.toString() + "\nArea : " + calcArea();
    }
}
