package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("src\\file.txt");
        try {
            file.delete();
            if (file.exists()) {
                System.out.println("The file already exists");
            } else {
                System.out.println(file.createNewFile());
                System.out.println("Is Hidden: " + file.isHidden());
                System.out.println("Path: " + file.getAbsolutePath());
                System.out.println("Last Modified: "
                        + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The system was not able to create this file");
        }
    }
}