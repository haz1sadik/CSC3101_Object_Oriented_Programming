package Lab2_Week2.Shop;

import Lab1_Week1.Q3.Fan;

public class TestProduct {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10.0, "Blue");
        Shop shop1 = new Shop("Ah Seng", fan1, 12.9, 3);
        System.out.println(shop1);

    }
}
