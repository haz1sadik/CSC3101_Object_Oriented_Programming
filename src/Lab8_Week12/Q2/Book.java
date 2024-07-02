/*
Name : MUHAMMAD HAZUAN BIN SADIK
Matric No : 223877
*/
package Lab8_Week12.Q2;

import java.io.Serializable;

public class Book implements Serializable{
    private String title;
    private double price;
    private static double total = 0;

    public Book(){
        addTotalPriceOfBooks(price);
    }
    public Book(String title, double price){
        this.price = price;
        this.title = title;
        addTotalPriceOfBooks(price);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public static double getTotal() {
        return total;
    }
    public static void addTotalPriceOfBooks(double price){
        total += price;
    }
}
