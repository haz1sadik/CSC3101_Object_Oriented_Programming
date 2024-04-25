package Lab4_Week6_7.Q2;

public class Shape {
    private String color;
    public final double pi = 3.14159265359;
    public Shape(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color : " + getColor();
    }
}
