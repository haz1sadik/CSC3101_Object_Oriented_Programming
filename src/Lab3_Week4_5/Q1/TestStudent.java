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
        /*System.out.print("Enter Student Matric Number : ");
        student.setMatricNum(input.nextInt());
        input.nextLine();
        System.out.print("Enter Student Name : ");
        student.setName(input.nextLine());
        System.out.print("Enter Student Email : ");
        student.setEmail(input.nextLine());
        System.out.print("Enter Student GPA : ");
        student.setGpa(input.nextDouble());

        System.out.print("Enter Undergraduate Student Matric Number : ");
        undergraduate1.setMatricNum(input.nextInt());
        input.nextLine();
        System.out.print("Enter Undergraduate Student Name : ");
        undergraduate1.setName(input.nextLine());
        System.out.print("Enter Undergraduate Student Email : ");
        undergraduate1.setEmail(input.nextLine());
        System.out.print("Enter Undergraduate Student GPA : ");
        undergraduate1.setGpa(input.nextDouble());
        input.nextLine();
        System.out.print("Enter Undergraduate Student Classification : ");
        undergraduate1.setClassification(input.next());

        System.out.print("\nEnter Postgraduate Student Matric Number : ");
        postgraduate1.setMatricNum(input.nextInt());
        input.nextLine();
        System.out.print("Enter Postgraduate Student Name : ");
        postgraduate1.setName(input.nextLine());
        System.out.print("Enter Postgraduate Student Name : ");
        postgraduate1.setEmail(input.nextLine());
        System.out.print("Enter Postgraduate Student GPA : ");
        postgraduate1.setGpa(input.nextDouble());
        input.nextLine();
        System.out.print("Enter Undergraduate Student Thesis Name : ");
        postgraduate1.setThesisName(input.next());

        System.out.println(student);
        System.out.println(undergraduate1);
        System.out.println(postgraduate1);
         */
    }
}
