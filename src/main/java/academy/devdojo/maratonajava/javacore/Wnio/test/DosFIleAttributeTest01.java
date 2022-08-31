package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFIleAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/baianodeus.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        boolean isHidden = dosFileAttributes.isHidden();
        boolean isReadOnly = dosFileAttributes.isReadOnly();
        System.out.println(isHidden);
        System.out.println(isReadOnly);

        DosFileAttributeView dosAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosAttributeView.setHidden(false);
        dosAttributeView.setReadOnly(false);

        isHidden = dosAttributeView.readAttributes().isHidden();
        isReadOnly = dosAttributeView.readAttributes().isReadOnly();
        System.out.println(isHidden);
        System.out.println(isReadOnly);

    }

}
