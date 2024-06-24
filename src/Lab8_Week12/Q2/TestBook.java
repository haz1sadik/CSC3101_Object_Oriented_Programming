package Lab8_Week12.Q2;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Book " + (i+1));
            System.out.print("Enter Title : ");
            String title = input.nextLine();
            System.out.print("Enter Price :");
            double price = input.nextDouble();
            input.nextLine();
            Book book = new Book(title, price);
            //try(ObjectOutputStream output)
        }

    }
}
