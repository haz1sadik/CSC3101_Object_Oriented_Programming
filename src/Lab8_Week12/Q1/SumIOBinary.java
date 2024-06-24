package Lab8_Week12.Q1;

import java.io.*;
import java.util.Random;

public class SumIOBinary {
    public static void main(String[] args) {
        int noNum = 150, sum = 0;
        int[] numbers = new int[noNum];
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab8_Week12\\Q1\\inputNum.dat", true));
            Random random = new Random();
            for (int i = 0; i < noNum; i++){
                int temp = random.nextInt(1, 10);
                output.writeInt(temp);
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }catch (IOException ioe){
            System.out.println("I/O Error");
        }
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab8_Week12\\Q1\\inputNum.dat"));
            for (int i = 0; i < noNum; i++){
                numbers[i] = input.readInt();
                sum += numbers[i];
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }catch (IOException ioe){
            System.out.println("IO Exception");
        }
        for (int i = 0; i < noNum; i++){
            System.out.println("Number " + (i+1) + " : " +numbers[i]);
        }
        System.out.println("Summation : " + sum);
    }

}
