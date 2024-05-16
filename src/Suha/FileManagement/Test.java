package Suha.FileManagement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName = "FileManagement.java";

        // Create a File object
        File file = new File(fileName);

        try {
            // Check if the file already exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create the file
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File creation failed.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
