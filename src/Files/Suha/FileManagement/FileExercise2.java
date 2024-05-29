package Files.Suha.FileManagement;
import java.util.Scanner;
import java.io.File;
public class FileExercise2 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fname = sc.nextLine();

        File file = new File("C:\\Users\\Norzaleha\\Desktop\\suha 2.0\\degree\\csc3101\\src\\exercise\\"+fname);

        if (file.exists()) {

            System.out.println("File already exists");
            System.out.println("Do you want to delete the file?(y/n)");
            char ans = sc.next().charAt(0);
            sc.nextLine();

            if (ans == 'y') {
                if(file.delete()) {
                    System.out.println("File deleted.");
                }
                else {
                    System.out.println("Failed to delete the file.");
                }
            }
        }
        else {
            System.out.println("File does not exists ");

        }

        sc.close();
    }

}
