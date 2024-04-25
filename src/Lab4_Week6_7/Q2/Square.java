package Lab4_Week6_7.Q2;

public class Square extends TwoDimensional{
    private double length;
    public Square(double length, int numOfSides, String color){
        super(numOfSides, color);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return "\nSquare\n" + super.toString() + "\nArea : " + calcArea();
    }
}
