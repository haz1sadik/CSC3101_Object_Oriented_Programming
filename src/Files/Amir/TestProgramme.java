package Files.Amir;

import java.util.Scanner;
import java.io.*;
public class TestProgramme{
    public static void main (String[]args){
        try{
            java.io.File file = new java.io.File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Files\\Amir\\upm.txt");
            Document doc = new Document (file);
            java.io.File file2 = new java.io.File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Files\\Amir\\output.txt");
            PrintWriter print = new PrintWriter (file2);
            print.println("Number of Characters : "+doc.countCharacters());
            print.println("Number of Words : "+doc.countWords());
            print.println("Number of Lines : "+doc.countLines());
            print.close();
        }

        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException4");
        }
    }
}