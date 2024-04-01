package Lab2.Q3;

import Lab1.Q1.Identification;

public class Book {
    private final String name;
    private double price ;
    private int qty;
    private final Identification AUTHOR;

    Book(String name, double price, int qty, Identification AUTHOR){
        this.name = name;
        this.AUTHOR = AUTHOR;
        setPrice(price);
        setQty(qty);
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public Identification getAUTHOR() {
        return AUTHOR;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "\n" + getName() + " by " + getAUTHOR() + " with price RM" + Math.round((getPrice() * getQty())*100.0)/100.0;
    }
}
