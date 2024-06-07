/*
 * Name : MUHAMMAD HAZUAN BIN SADIK
 * Matric Number : 223877
 */
package Lab7_Week10_11.Q2;

public class Triangle extends Shape implements printObject{

    //Attributions declaration
    private double height;
    private double width;
    public Triangle(String color, double width, double height){ //Constructor
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean checkWidthAndHeight(){
        return this.width > 0 && this.height > 0;
    }

    @Override
    public double getArea() {
        return (1.0/2.0) * this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
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
