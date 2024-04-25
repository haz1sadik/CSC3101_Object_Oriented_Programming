package Lab4_Week6_7.Q2;

public class Sphere extends ThreeDimensional{
    private double radius;
    public Sphere(double radius, int numOfSurface, String color){
        super(numOfSurface, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return pi * 4 * Math.pow(getRadius(), 2);
    }

    @Override
    public double calcVolume() {
        return (4.0/3.0) * pi * Math.pow(getRadius(), 3);
    }
    @Override
    public String toString() {
        return "\nSphere\n" + super.toString() + "\nArea : " + calcArea() + "\nVolume : " + calcVolume();
    }
}
