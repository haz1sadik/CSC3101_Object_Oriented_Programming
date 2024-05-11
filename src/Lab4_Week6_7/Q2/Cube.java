package Lab4_Week6_7.Q2;
//Cube is a child class from superclass ThreeDimensional
public class Cube extends ThreeDimensional{
    //attributes declarations
    private double length;
    public Cube(double length, int numOfSurface, String color){
        super(numOfSurface, color);
        setLength(length);
    }

    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return Math.pow(getLength(), 2) * 6;
    }

    @Override
    public double calcVolume() {
        return Math.pow(getLength(), 3);
    }

    @Override
    public String toString() {
        return "\nCube\n" + super.toString() + "\nArea : " + calcArea() + "\nVolume : " + calcVolume();
    }
}
