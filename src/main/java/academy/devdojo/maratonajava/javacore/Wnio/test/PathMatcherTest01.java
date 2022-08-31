package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path4 = Paths.get("pasta/subpasta/file.class");
        Path path5 = Paths.get("pasta/subpasta/baiano.class");

        matches(path1, "glob:**.bkp"); // ** ignora todos diretórios que vem a esquerda deste path

        matches(path1, "glob:**/*.bkp");

        matches(path4, "glob:**.{bkp,java,txt}"); // {} servem como agrupamento, funcionando como um "or"

        matches(path4, "glob:**.?????"); // ??? significa que terão 3 caracteres indeterminados

        matches(path5, "glob:**baiano.?????");

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));

    }
}
