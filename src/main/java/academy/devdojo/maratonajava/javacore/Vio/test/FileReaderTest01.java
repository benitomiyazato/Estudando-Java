package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("src\\file.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            StringBuilder sb = new StringBuilder();
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
            System.out.print(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
