package Lab4_Week6_7.Q1;
//Vehicle as a superclass
public class Vehicle {
    //attributes declarations
    private int speed;
    private String color;
    private double regularPrice;
    public Vehicle(String color, int speed, double regularPrice){
        setColor(color);
        setSpeed(speed);
        setRegularPrice(regularPrice);
    }
    //Getters
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public double getRegularPrice() {
        return regularPrice;
    }
    //Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    //Method to get Sales Price
    public double SalePrice(){
        return getRegularPrice();
    }
}
