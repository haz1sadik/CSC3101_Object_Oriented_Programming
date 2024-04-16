package Exer_Inheritance;

import java.util.Scanner;

public class TestStaff {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        Staff staff1 = new Staff();
        Manager manager1 = new Manager();

        System.out.print("Enter Staff ID : ");
        staff1.setStaffID(inputNumber.nextInt());
        System.out.print("Enter Staff Salary : ");
        staff1.setSalary(inputNumber.nextDouble());

        System.out.print("\nEnter Manager ID : ");
        manager1.setStaffID(inputNumber.nextInt());
        System.out.print("Enter Manager Department : ");
        manager1.setDepartment(inputString.next());
        System.out.print("Enter Manager Salary : ");
        manager1.setSalary(inputNumber.nextDouble());

        System.out.println(staff1);
        System.out.println(manager1);
    }
}
