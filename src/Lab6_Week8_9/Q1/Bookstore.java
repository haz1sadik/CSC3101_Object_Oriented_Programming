package Lab6_Week8_9.Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        File books = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab6_Week8_9\\Q1\\books.txt");
        Scanner inputLine = new Scanner(System.in);
        Scanner inputToken = new Scanner(System.in);
        try {
            FileWriter write = new FileWriter(books);

            String bookName; double price;
            char repeat = 'Y';
            while (repeat == 'Y' || repeat == 'y'){
                System.out.print("Enter Book Name : ");
                bookName = inputLine.nextLine();
                write.write( bookName + ": ");
                System.out.print("Enter Book Price : ");
                price = inputToken.nextDouble();
                if (price == 0) {
                    throw new InputMismatchException();
                }else {
                    write.write(price + ": \n");
                }

                System.out.println("Continue? [Y/N]");
                repeat = inputToken.next().charAt(0);
            }
            write.close();

        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }catch (IOException ioe){
            System.out.println("Invalid File");
        }catch (InputMismatchException ime){
            System.out.println("Invalid Input");
        }
    }
}
