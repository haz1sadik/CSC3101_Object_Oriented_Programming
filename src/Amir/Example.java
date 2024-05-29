package Amir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try

        {
            File file = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Amir\\file.dat");
            Scanner print = new Scanner(file);
            int counter = 1;
            while (print.hasNext()) {
                int length = print.nextInt();
                System.out.println("Length " + counter + " : " + length);
                int width = print.nextInt();
                System.out.println("Width " + counter + " : " + width);
                System.out.println();
                counter++;
            }


            print.close();
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
