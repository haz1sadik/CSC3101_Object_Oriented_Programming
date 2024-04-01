package Lab2.Q1;

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course[] courses = new Course[3];
        for (int i = 0; i < courses.length; i++){
            System.out.print("Enter Course Name : ");
            courses[i] = new Course(input.nextLine());
            int j = 0;
            System.out.print("Enter Student " + (j+1) + " Name (0 to exit): ");
            courses[i].addStudent(input.nextLine());
            while (!(courses[i].getStudents().get(j)).equals("0")){
                j++;
                System.out.print("Enter Student " + (j+1) + " Name (0 to exit): ");
                courses[i].addStudent(input.nextLine());
            }
        }
        for (int i = 0; i < courses.length; i++){
            System.out.print("\nNumber of students in " + courses[i].getCourseName() + " course : " + (courses[i].getNumberOfStudents()-1));
            for (int j = 0; j < courses[i].getNumberOfStudents()-1; j++){
                System.out.print("\n" + (j+1) + ". " + courses[i].getStudents().get(j));
            }
        }
    }
}
