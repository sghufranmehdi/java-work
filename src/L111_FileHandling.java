import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L111_FileHandling {
    public static void main(String[] args) {
        //code to create a new file
        /*
        File myFile = new File("L111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }



        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("L111file.txt");

            fileWriter.write("This is first file from java code\nOkay now Bye");

            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        // Reading a file
        File myFile = new File("L111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
// Deleting a file
        File myFile = new File("L111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }


    }
}
