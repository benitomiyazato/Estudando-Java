package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        // NAO FUNCIONA NO SISTEMA OPERACIONAL DO WINDOWS
        Path baiano = Paths.get("/home/william/dev/arquivobaianonovo.txt");
        Files.readAttributes(baiano, PosixFileAttributes.class);
    }

}
