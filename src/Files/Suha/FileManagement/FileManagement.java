package Files.Suha.FileManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagement {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HazuanTech\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Files.Suha\\test.txt");
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

            // Write some content to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is a test file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            
        }
    }
}
