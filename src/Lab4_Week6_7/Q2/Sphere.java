package Lab4_Week6_7.Q2;
//Sphere is a child class from superclass ThreeDimensional
public class Sphere extends ThreeDimensional{
    //attributes declarations
    private double radius;
    public Sphere(double radius, int numOfSurface, String color){
        super(numOfSurface, color);
        setRadius(radius);
    }
    //Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Method to calculate total area of a Sphere
    @Override
    public double calcArea() {
        return pi * 4 * Math.pow(getRadius(), 2);
    }

    //Method to calculate volume a sphere
    @Override
    public double calcVolume() {
        return (4.0/3.0) * pi * Math.pow(getRadius(), 3);
    }
    @Override
    public String toString() {
        return "\nSphere\n" + super.toString() + "\nArea : " + calcArea() + "\nVolume : " + calcVolume();
    }
}
