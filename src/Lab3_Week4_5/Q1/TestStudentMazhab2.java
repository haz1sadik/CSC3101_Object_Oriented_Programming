package Lab3_Week4_5.Q1;

import java.util.Scanner;

public class TestStudentMazhab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Type (1 : Student, 2 : Undergraduate, 3 : Postgraduate): ");
        int studentType = input.nextInt();

        if (studentType == 1){
            Student student = new Student();
            System.out.print("Enter Student Matric Number : ");
            student.setMatricNum(input.nextInt());
            input.nextLine();
            System.out.print("Enter Student Name : ");
            student.setName(input.nextLine());
            System.out.print("Enter Student Email : ");
            student.setEmail(input.nextLine());
            System.out.print("Enter Student GPA : ");
            student.setGpa(input.nextDouble());
        } else if (studentType == 2) {
            Undergraduate undergraduate1 = new Undergraduate();
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
        }
        else {
            Postgraduate postgraduate1 = new Postgraduate();
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
        }

    }
}

