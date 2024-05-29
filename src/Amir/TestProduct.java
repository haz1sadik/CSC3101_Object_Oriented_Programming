package Amir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Amir\\productIn.dat");
        try {
            Scanner print = new Scanner(file);
            print.useDelimiter(":");
            String[] productCode = new String[3];
            String[] qty = new String[3];
            String[] price = new String[3];
            for (int i = 0; i< qty.length; i++){
                productCode[i] = print.next();
                qty[i] = print.next();
                price[i] = print.next();
            }
            for (int i = 0; i < qty.length; i++){
                System.out.println("Product Code" + (i+1) + " : " + productCode[i]);
                System.out.println("Quantity" + (i+1) + " : " + qty[i]);
                System.out.println("Price" + (i+1) + " : " + price[i]);
                System.out.println();
            }
        }catch (InputMismatchException ime){
            System.out.println("Input Not Valid");
        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }
    }
}
