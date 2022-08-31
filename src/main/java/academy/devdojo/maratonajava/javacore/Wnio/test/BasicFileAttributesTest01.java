package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime nowMinusOneMonth = LocalDateTime.now().plusMonths(1);

        Path novotxt = Paths.get("home/william/dev/novo.txt");
        if (Files.notExists(novotxt)) {
            Files.createFile(novotxt);
            System.out.println("Arquivo criado");
        }

        Files.setLastModifiedTime(novotxt, FileTime.from(nowMinusOneMonth.toInstant(ZoneOffset.UTC)));
        System.out.println(Files.getLastModifiedTime(novotxt));
    }
}
