package fileoperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    public static  void run(){
        try {
            FileReader reader=new FileReader("nothing.txt");
            int ch=reader.read();
            while (ch!=-1){
                System.out.print((char)ch);
                ch=reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
