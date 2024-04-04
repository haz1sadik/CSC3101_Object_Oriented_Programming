package Lab2_Week2.Shop;

import Lab1_Week1.Q3.Fan;

public class Shop {
    private String name;
    private Fan product;
    private double price;
    private int qty;

    public Shop() {
    }

    public Shop(String name, Fan product, double price, int qty) {
        this.name = name;
        this.product = product;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return product + " Price is : RM" + getPrice() + " quantity is : " + getQty() + " Total Is : RM" + getPrice()*getQty();
    }
}
