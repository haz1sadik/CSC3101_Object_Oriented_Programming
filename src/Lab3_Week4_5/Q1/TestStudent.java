package Lab3_Week4_5.Q1;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nUNDERGRADUATE STUDENT DETAILS");
        System.out.print("Enter Student Matric Number : ");
        int undergradMatric = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student Name : ");
        String undergradName = input.nextLine();
        System.out.print("Enter Student Email : ");
        String undergradEmail = input.next();
        System.out.print("Enter Student GPA : ");
        double undergradGPA = input.nextDouble();
        System.out.print("Enter Student Classification : ");
        String undergradClass = input.next();

        Undergraduate undergradStudent = new Undergraduate(undergradMatric, undergradName, undergradEmail, undergradGPA, undergradClass);

        System.out.println("\nPOSTGRADUATE STUDENT DETAILS");
        System.out.print("Enter Student Matric Number : ");
        int postgradMatric = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student Name : ");
        String postgradName = input.nextLine();
        System.out.print("Enter Student Email : ");
        String postgradEmail = input.next();
        System.out.print("Enter Student GPA : ");
        double postgradGPA = input.nextDouble();
        System.out.print("Enter Student Thesis Title : ");
        String postgradThesisTitle = input.next();

        Postgraduate postGradstudent = new Postgraduate(postgradMatric, postgradName, postgradEmail, postgradGPA, postgradThesisTitle);

        System.out.println(undergradStudent);
        System.out.println(postGradstudent);
    }
}
