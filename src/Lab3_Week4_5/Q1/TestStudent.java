package Lab3_Week4_5.Q1;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Undergraduate undergraduate1 = new Undergraduate();
        Postgraduate postgraduate1 = new Postgraduate();

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

        System.out.println(undergraduate1);
        System.out.println(postgraduate1);



    }
}
