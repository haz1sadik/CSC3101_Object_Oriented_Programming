package Files.Amir;

import java.util.Scanner;
import java.io.FileNotFoundException;
class Document{
    private java.io.File infile;

    public Document(){
    }

    public Document(java.io.File infile){
        this.infile=infile;
    }

    public int countCharacters(){
        int counter = 0;
        try{
            Scanner read = new Scanner (infile);

            while (read.hasNextLine()){
                System.out.println(".");
                String line = read.nextLine().trim();
                for (int i=0;i<line.length();i++){
                    counter++;
                }
                System.out.println(counter);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException1");
        }
        return counter;
    }

    public int countWords (){
        int counter = 0;
        try{
            Scanner read = new Scanner(infile);
            read.useDelimiter(" ");

            while (read.hasNext()){
                counter++;
            }

        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException2");
        }
        return counter;
    }

    public int countLines(){
        int counter=0;
        try{
            Scanner read = new Scanner (infile);

            while (read.hasNextLine()){
                counter++;
            }

        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException3");
        }
        return counter;
    }
}