package Lab7_Week10_11.Q2;

public class Triangle extends Shape implements printObject{
    private double height;
    private double width;
    public Triangle(String color, double width, double height){
        super(color);
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
