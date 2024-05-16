package Lab5_Week7.Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Input is not an integer. Setting default values to 0.");
        }

        if (num1 == 0 && num2 == 0) {
            System.out.println("Both inputs are zero. No operations to perform.");
        } else {
            try {
                int result = num1 / num2;
                System.out.println("Result: " + result);

                if (result < 2) {
                    throw new NumberFormatException();
                } else if (result > 2) {
                    throw new Exception();
                }
            } catch (NumberFormatException nfe) {
                System.out.println("The result is less than 2");
            } catch (ArithmeticException ae) {
                System.out.println("Cannot divide by zero");
            } catch (Exception e) {
                System.out.println("The result is more than 2");
            } finally {
                System.out.println("Please rerun the program");
            }
        }
    }
}