package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src/File/file1.txt");
            fileWriter.write("Hello, file 1 written \n");
            fileWriter.write("Hello, file 1 written again \n");
            fileWriter.write("Hello, file 1 written again part 2 \n");


            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
