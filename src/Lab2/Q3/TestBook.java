package Lab2.Q3;

import Lab1.Q1.Identification;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        Scanner inputToken = new Scanner(System.in);
        int numberOfBooks = 2;
        Identification[] authors = new Identification[numberOfBooks];
        Book[] books = new Book[numberOfBooks];
        for (int i = 0; i < authors.length; i++) {
            String name, email, bookName;
            char gender;
            int quantity;
            double price;
            System.out.println("\n========== Author " + (i + 1) + "'s Details ==========\n");
            System.out.print("Enter author " + (i + 1) + "'s Name : ");
            name = inputLine.nextLine();
            System.out.print("Enter author " + (i + 1) + "'s Gender (M/F): ");
            gender = inputToken.next().charAt(0);
            System.out.print("Enter author " + (i + 1) + "'s Email : ");
            email = inputLine.nextLine();
            authors[i] = new Identification(name, gender, email);
            System.out.println("\n=========== Book " + (i + 1) + "'s Details ===========\n");
            System.out.print("Enter book " + (i + 1) + "'s Name : ");
            bookName = inputLine.nextLine();
            System.out.print("Enter book " + (i + 1) + "'s Price : RM");
            price = inputToken.nextDouble();
            System.out.print("Enter book " + (i + 1) + "'s Quantity : ");
            quantity = inputToken.nextInt();
            books[i] = new Book(bookName, price, quantity, authors[i]);
        }
        System.out.println("\n======== Summary ========");
        for (int i = 0; i < authors.length; i++){
            System.out.print(books[i]);
        }
    }
}
