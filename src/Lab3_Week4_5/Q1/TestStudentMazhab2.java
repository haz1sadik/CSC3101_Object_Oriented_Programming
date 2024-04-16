package Lab3_Week4_5.Q1;

import java.util.Scanner;

public class TestStudentMazhab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentType = 1;

        while (studentType >= 1 && studentType <= 3){
            if (studentType == 1){
                System.out.print("Enter Student Type : ");
                studentType = input.nextInt();
            } else if (studentType == 2) {
                System.out.print("Enter Student Type : ");
                studentType = input.nextInt();
            }
            else {
                System.out.print("Enter Student Type : ");
                studentType = input.nextInt();
            }
        }
    }
}
