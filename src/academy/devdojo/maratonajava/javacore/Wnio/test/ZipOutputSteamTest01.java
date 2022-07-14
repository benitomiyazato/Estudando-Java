package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipOutputStream;

public class ZipOutputSteamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("folder1/file.zip");
        Path filesToZip = Paths.get("folder1/subfolder1/subsubfolder1");

        zip(zipFile, filesToZip);
    }

    private static void zip(Path zipFile, Path filesToZip) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(zipFile)) {
            for (Path file : directoryStream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
