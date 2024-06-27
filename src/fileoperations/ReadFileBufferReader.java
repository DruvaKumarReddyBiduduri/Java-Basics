package fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileBufferReader {
    public static  void run(){
        try {
            FileReader fileReader=new FileReader("nothing.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            String line=reader.readLine();
//            Scanner reader=new Scanner(file);
            while (line!=null){
                System.out.println(line);
                line= reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
