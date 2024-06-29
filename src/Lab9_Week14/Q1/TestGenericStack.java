package Lab9_Week14.Q1;

import java.util.Scanner;
public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter five strings
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        // Display the strings in reverse order
        System.out.println("Strings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
