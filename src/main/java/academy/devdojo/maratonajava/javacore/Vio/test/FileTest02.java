package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File directory = new File("folder");
        directory.mkdir();
        File file = new File(directory, "fileX.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File renamedFile = new File(directory, "renamed_file.txt");
        file.renameTo(renamedFile);
    }
}
