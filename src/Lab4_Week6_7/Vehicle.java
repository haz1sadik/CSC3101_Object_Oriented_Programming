package Lab4_Week6_7;

public class Vehicle {
    private int speed;
    private String color;
    private double regularPrice;
    public Vehicle(String color, int speed, double regularPrice){
        setColor(color);
        setSpeed(speed);
        setRegularPrice(regularPrice);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public double SalePrice(){
        return getRegularPrice();
    }
}
