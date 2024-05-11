package Lab4_Week6_7.Q1;
//Lorry child class to superclass Vehicle

public class Lorry extends Vehicle{
    //attributes declarations
    private int weight;
    public Lorry(int weight, String color, int speed, double regularPrice){
        super(color, speed, regularPrice);
        setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Overriding/Polymorphic method from Vehicle to calculate Sales Price
    @Override
    public double SalePrice() {
        if (getWeight() > 2500)
            return super.SalePrice() * 0.925;
        else
            return super.SalePrice() * 0.9;
    }

    //Method to print informations
    @Override
    public String toString() {
        return "\nLorry\n" + "Weight : " + getWeight() + "\nColor : " + getColor() + "\nSpeed : " + getSpeed() + "\nRegular Price : " + getRegularPrice() + "\nPrice After Discount : " + SalePrice();
    }
}
