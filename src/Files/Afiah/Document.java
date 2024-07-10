package Files.Afiah;/*
NUR AFIAH LIANA BINTI IZANI
224157
study
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Document {
    java.io.File infile;

    public Document () {}

    public Document (java.io.File infile) {
        this.infile = infile;
    }

    public int countCharacters () {
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner(infile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine().replaceAll("\\s", "");
                for(int i = 0 ; i < line.length(); i++){
                    count++;
                }            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return count;
    }

    public int countWords () {
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner (infile);
            scanner.useDelimiter("\\S+");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+"); // Split on one or more whitespace characters
                count = words.length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return count;
    }

    public int countLines () {
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner(infile);
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return count;
    }
}