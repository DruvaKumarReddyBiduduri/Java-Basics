

import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void run() throws IOException {

        FileReader fr = new FileReader("./nothing.txt");
        int ch = fr.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = fr.read();
        }

        fr.close();

    }
}
