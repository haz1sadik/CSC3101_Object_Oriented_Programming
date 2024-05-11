package Lab4_Week6_7.Q2;
//Shape as Superclass
public class Shape {
    //attributes declarations
    private String color;
    public final double pi = 3.14159265359;
    public Shape(String color){
        setColor(color);
    }

    //Getters and Setters
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
