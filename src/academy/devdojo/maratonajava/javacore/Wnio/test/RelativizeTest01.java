package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path absolute1 = Paths.get("/home/william");
        Path absolute2 = Paths.get("/user/Local");
        Path absolute3 = Paths.get("/home/william/devdojofoda/helloWorld.java");
        Path relative1 = Paths.get("temp");

        System.out.println("1: " + absolute1.relativize(absolute3)); // absolute 1 to 3
        System.out.println("2: " + absolute3.relativize(absolute1)); // absolute 3 to 1
        System.out.println("3: " + absolute1.relativize(absolute2)); // absolute 1 to 2
        
        try {
            System.out.println("5: " + absolute1.relativize(relative1)); // excpetion->java n sabe onde o relativo
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
