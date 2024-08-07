/*
Name : MUHAMMAD HAZUAN BIN SADIK
Matric No : 223877
*/
package Lab8_Week12.Q2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) throws ClassNotFoundException, IOException { // Main Method
        String fileName = "C:\\Users\\User\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab8_Week12\\Q2\\inputObject.dat";
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int counterBook = 0;
        try(ObjectOutputStream outputObject = new ObjectOutputStream(new FileOutputStream(fileName))){
            //Loop to input
            for (int i = 0; i < 5; i++){
                System.out.println("Book " + (i+1));
                System.out.print("Enter Title : ");
                String title = input.nextLine();
                System.out.print("Enter Price :");
                double price = input.nextDouble();
                input.nextLine();
                Book book = new Book(title, price);
                //write to file
                outputObject.writeObject(book);
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }catch (IOException ioe){
            System.out.println("IO Exception");
        }
        ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream(fileName));
        while(true){
            try{
                Book temp = (Book) inputObject.readObject();
                System.out.println(temp.getTitle());
                books.add(temp);
                Book.addTotalPriceOfBooks(temp.getPrice());
                counterBook++;
            }catch (EOFException eofe){
                System.out.println("End Of File Reached");
                break;
            }catch (FileNotFoundException fnfe){
                System.out.println("File not found");
            }
            System.out.println("Number of Books : " + counterBook);
            System.out.println(Book.getTotal());
        }
        int count = 1;
        //loop to print books details
        for (Book book : books){
            System.out.println("Book " + count);
            System.out.println("Title : " + book.getTitle());
            System.out.println("Price : RM" + book.getPrice());
            count++;
        }
    }
}
