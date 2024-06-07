/*
 * Name : MUHAMMAD HAZUAN BIN SADIK
 * Matric Number : 223877
 */
package Lab7_Week10_11.Q2;

public class Circle extends Shape implements printObject{

    //Attributions declaration
    private double radius;
    public Circle(String color, double radius){ //Constructor
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean checkRadius(){
        return this.radius > 0;
    }

    @Override
    public double getArea() {
        return 3.142 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.142 * this.radius;
    }

    @Override
    public String printArea() {
        return getArea() + "cm";
    }

    @Override
    public String printPerimeter() {
        return getPerimeter() + "cm";
    }
}
