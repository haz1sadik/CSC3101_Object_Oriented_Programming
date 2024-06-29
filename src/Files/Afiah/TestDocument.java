package Files.Afiah;

/*
NUR AFIAH LIANA BINTI IZANI
224157
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class TestDocument {
    public static void main (String [] args) {
        PrintWriter print = null;
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Files\\Afiah\\upm.txt");
            Document doc = new Document(file);
            File file2 = new File("C:\\Users\\User\\IdeaProjects\\CSC3101_Object_Oriented_Programming\\src\\Files\\Afiah\\output.txt");
            print = new PrintWriter(file2);
            //print.println(doc.countCharacters());
            //System.out.println(doc.countWords());
            print.println(doc.countWords());
            //print.println(doc.countLines());
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        finally {
            if (print != null) {
                print.close();
            }
        }
    }
}