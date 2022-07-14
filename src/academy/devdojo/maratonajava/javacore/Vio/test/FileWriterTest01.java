package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("src\\file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("O baiano é bem gayyyyyyyy\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
