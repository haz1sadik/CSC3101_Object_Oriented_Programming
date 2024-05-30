/*
 * Name : Muhammad Hazuan Bin Sadik
 * Matric Number : 223877
 */
package Lab6_Week8_9.Q1;

//import related classes
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadBookstore {
    public static void main(String[] args) {
        //creating new input output File object
        File booksInput = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab6_Week8_9\\Q1\\books.txt");
        File booksOutput = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab6_Week8_9\\Q1\\booksOutput.txt");
        double totalPrice = 0, counter = 0, averagePrice;
        //try-catch block
        try {
            Scanner print = new Scanner(booksInput); //FileNotFoundException
            FileWriter writer = new FileWriter(booksOutput); //IOException

            //token delimiter
            print.useDelimiter(": ");
            //loop to check if the file has next line
            while (print.hasNextLine()) {
                //read form input file and placing the delimiter
                String bookName = print.next();
                double price = Double.parseDouble(print.next());
                //write to output file
                writer.write("Book Name : " + bookName);
                writer.write("\tPrice : RM" + price + "\n\n");

                //printing in console
                System.out.println("\nBook Name : " + bookName);
                System.out.println("Price : RM" + price);


                totalPrice += price;
                counter++;
                print.nextLine();
            }
            writer.write("Total Price = " + totalPrice);
            averagePrice = totalPrice / counter;
            writer.write("\nAverage Price = " + averagePrice);
            System.out.println("\nTotal Price : " + totalPrice);
            System.out.println("Average Price : " + averagePrice);

            writer.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("Input File Not Found");
        }catch (IOException ioe){
            System.out.println("Invalid File");
        }
    }
}
