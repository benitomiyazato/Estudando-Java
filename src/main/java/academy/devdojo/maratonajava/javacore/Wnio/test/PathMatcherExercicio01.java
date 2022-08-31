package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {
    // retornar tudo que há no diretório com extensao .java ou .class
    private static boolean matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        final String glob = "glob:**/*Test*.{java,class}";
        if (matches(file, glob)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    public class PathMatcherExercicio01 {
        public static void main(String[] args) throws IOException {
            Path root = Paths.get(".");
            Files.walkFileTree(root, new ListFiles());
        }
    }
}
