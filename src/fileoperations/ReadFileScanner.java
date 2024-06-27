package fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScanner {
    public static  void run(){
        try {
            File file=new File("nothing.txt");
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
