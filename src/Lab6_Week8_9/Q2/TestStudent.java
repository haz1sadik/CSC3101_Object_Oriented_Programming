/*
* Name : Muhammad Hazuan Bin Sadik
* Matric Number : 223877
*/
package Lab6_Week8_9.Q2;

//import related classes
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        //creating new input File object
        File input = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab6_Week8_9\\Q2\\InputFile.txt");

        //Check if the file exist
        if (input.exists()){
            System.out.println("\n= Input File Found =");
            System.out.println("= Creating output file =");
            //creating new output File object
            File output = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Lab6_Week8_9\\Q2\\OutputFile.txt");
            //Check if the file already exist
            if (output.exists()) {
                System.out.println("! Output File Already Exist !");
            }else {
                //try-catch block
                try {
                    Scanner read = new Scanner(input);
                    FileWriter writer = new FileWriter(output); //IOException
                    read.useDelimiter(":\\s");
                    while (read.hasNextLine()) {
                        //reading from input file
                        int matricNum = Integer.parseInt(read.next());
                        double test1 = Double.parseDouble(read.next());
                        double labTest = Double.parseDouble(read.next());
                        double quiz = Double.parseDouble(read.next());
                        double project = Double.parseDouble(read.next());
                        double finalExam = Double.parseDouble(read.next());
                        read.nextLine(); //go to next line
                        //creating new Student object
                        Student studentsGrade = new Student(matricNum, test1, labTest, quiz, project, finalExam);
                        writer.write(studentsGrade + "\n");
                    }
                    writer.close();
                    //informing the user if the data is written successfully
                    System.out.println("Data Written to a New File");

                } catch (FileNotFoundException fnfe) {
                    System.out.println("File Not Found");
                } catch (IOException ioe) {
                    System.out.println("Invalid File");
                }
            }
        } else {
            System.out.println("File Does not found");
        }

    }
}
