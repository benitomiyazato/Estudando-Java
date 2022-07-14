package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/william");
        Path file = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);
    }
}
