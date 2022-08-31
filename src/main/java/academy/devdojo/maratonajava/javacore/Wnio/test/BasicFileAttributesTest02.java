package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path novotxt = Paths.get("home/william/dev/novo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(novotxt, BasicFileAttributes.class);

        System.out.println(basicFileAttributes.lastModifiedTime());
        System.out.println(basicFileAttributes.lastAccessTime());
        System.out.println(basicFileAttributes.creationTime());

        System.out.println("----------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(novotxt, BasicFileAttributeView.class);
        FileTime fileCreationTime = FileTime.fromMillis(System.currentTimeMillis());

        fileAttributeView.setTimes(basicFileAttributes.lastModifiedTime(), basicFileAttributes.lastAccessTime(),
                fileCreationTime);
        System.out.println(fileAttributeView.readAttributes().lastModifiedTime());
        System.out.println(fileAttributeView.readAttributes().lastAccessTime());
        System.out.println(fileAttributeView.readAttributes().creationTime());

    }

}
