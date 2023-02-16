package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferedReader {
    public static void main(String[] args) {
        try {
            File file = new File("src/File/file1.txt");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String data = "";

            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
