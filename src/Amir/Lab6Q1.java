package Amir;
/* Name : Amir Syarifuddin
   Course : Computer Network
   Matric Number : 224300*/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Lab6Q1{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Rectangle> rectangles = new ArrayList<>();//create array list
        java.io.File file = new java.io.File("rectInfo.txt");
        PrintWriter writer = null;// Initialize PrintWriter variable to null to ensure it's accessible in the finally block
        try {
            double totalArea = 0; // Initialize total area
            double totalPerimeter = 0; // Initialize total perimeter
            writer= new PrintWriter(file);// Create a new PrintWriter object to write to the specified file
            for (int i = 1; i <= 15; i++) {
                //user enter input 
                System.out.println("Please enter the width of rectangle " + i + " : ");
                double width = sc.nextDouble();
                System.out.println("Please enter the length of rectangle " + i + " : ");
                double length = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);//create rectangle object
                rectangles.add(rectangle);//add rectangle object into "rectangles" array list
                totalArea += rectangle.getArea(); // Accumulate total area
                totalPerimeter += rectangle.getPerimeter(); // Accumulate total perimeter
            }

            //write all the rectangle info into the rectInfo.txt file
            for (int i = 0; i < rectangles.size(); i++) {
                Rectangle rectangle = rectangles.get(i);
                writer.println("Rectangle " + (i + 1) + " Attributes:");
                writer.println("Width: " + rectangle.getWidth());
                writer.println("Length: " + rectangle.getLength());
                rectangle.displayAreaPerimeter();
                writer.println("Area: " + rectangle.getArea());
                writer.println("Perimeter: " + rectangle.getPerimeter());
                writer.println();
            }
            double averageArea = totalArea / rectangles.size();
            double averagePerimeter = totalPerimeter / rectangles.size();

            writer.println("Average Area: " + averageArea);
            writer.println("Average Perimeter: " + averagePerimeter);
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Input mismatch. Please enter a valid number.");
        }

        catch (FileNotFoundException fnfe){
            System.out.println("An error occurred, file not found: " + fnfe.getMessage());
        }

        finally {
            System.out.println("Number of Rectangle objects created: " + Rectangle.getNoOfObj());
            if (writer !=null){
                writer.close();}
        }
    }
}