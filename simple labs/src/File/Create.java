package File;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/File/file1.txt");
        File file2 = new File("src/File/file2.txt");

        if(file1.createNewFile()) {
            System.out.println("File 1 created");
        } else {
            System.out.println("File 1 not created");
        }

        if(file2.createNewFile()) {
            System.out.println("File 2 created");
        } else {
            System.out.println("File 2 not created");
        }
    }
}
