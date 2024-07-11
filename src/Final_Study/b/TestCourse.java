package Final_Study.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        try {
            Scanner readFile = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Final_Study\\b\\courseData.dat"));
            PrintWriter output = new PrintWriter("C:\\Users\\User\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Final_Study\\b\\courseStatus.dat");
            ArrayList<Courses> listCourse = new ArrayList<>();
            output.println("Courses Information Status");
            output.println("_________________________________");
            int i = 0;
            while (readFile.hasNextLine()) { // Read line by line
                String datas = readFile.nextLine();
                String[] data = datas.split(":");
                listCourse.add(new Courses(data[0], data[1], Integer.parseInt(data[2])));
                output.printf("%-20s%-15s%-40s\n", listCourse.get(i).code, listCourse.get(i).quota, listCourse.get(i).checkQuota());
                i++;
            }
            output.println("__________________________________________");
            output.println("Total courses is " + listCourse.size());
            readFile.close();
            output.close();
        }
        catch (FileNotFoundException err) {
            System.out.println("ERROR ONE: FileNotFoundException");
        }catch (Exception err){
            System.out.println("ERROR TWO : Exception");
        }
    }
}
