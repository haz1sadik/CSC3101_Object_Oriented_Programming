package Files.Amir.Lab8;
/* Name : Amir Syarifuddin
   Course : Computer Network
   Matric Number : 224300*/

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.Date;
class Lab8Q2{
   public static void main (String[]args){
   
   // Writing objects to XYZinfo.dat using ObjectOutputStream
   try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("XYZinfo.dat"))){
      double[]number=new double[6];
      // Generate random numbers for the array
      for (int i=0;i<6;i++){
         number[i]= 5 + (49 * Math.random());
      }
      Date currentDate = new Date();
      Rectangle rect1 = new Rectangle(10,5);
      Rectangle rect2 = new Rectangle(20,10);
      Rectangle rect3 = new Rectangle(2,1);
      int num = 123000;
      // Write objects to the ObjectOutputStream
      output.writeObject(number);
      output.writeInt(num);
      output.writeObject(currentDate);
      output.writeUTF("Hello Testing Binary IO");
      output.writeObject(rect1);
      output.writeObject(rect2);
      output.writeObject(rect3);
   }
   
   catch(FileNotFoundException e){
      System.out.println("File Not Found");
   }
   
   catch(IOException e){
      System.out.println("IO Exception");
   }
   
   // Reading objects from XYZinfo.dat using ObjectInputStream
   try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("XYZinfo.dat"))){
      double[]number=(double[])input.readObject();
      int num=input.readInt();
      Date currentDate=(Date)input.readObject();
      String word=input.readUTF();
      Rectangle rect1=(Rectangle)input.readObject();
      Rectangle rect2=(Rectangle)input.readObject();
      Rectangle rect3=(Rectangle)input.readObject();
      System.out.print("List Double Numbers : ");
      // Print the list of double numbers formatted to two decimal places
      for (int i=0;i<6;i++){
         System.out.print(String.format("%.2f", number[i]) + ", ");   
      }
      System.out.println();
      System.out.println("Integer Number : "+num);
      System.out.println("Date Info : "+currentDate);
      System.out.println("String Info : "+word);
      System.out.println(rect1);
      System.out.println(rect2);
      System.out.println(rect3);
   }
   
   catch(FileNotFoundException e){
      System.out.println("File Not Found");
   }
   
   catch(IOException e){
      System.out.println("IO Exception");
   }
   
   catch(ClassNotFoundException e){
      System.out.println("Class Not Found Exception");
   }
   

   
   
 }
}


   
      