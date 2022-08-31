package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        Stream.of("\nEleve", " o ", " cosmo ", " no ", " seu ", " coração\n")
                .map(String::toUpperCase)
                .forEach(System.out::print);

        int[] intArray = { 1, 2, 3, 4, 56, 6, 7, 8, 9, 9 };
        IntStream intStream = Arrays.stream(intArray);
        intStream.average().ifPresent(System.out::println); // média

        /* -------------------------------------------- */
        try (Stream<String> lines = Files.lines(Paths.get("folder\\baianodeus.txt"))) {
            List<String> linhasComBaiano = lines.filter(l -> l.contains("Baiano"))
                    .collect(Collectors.toList());
            System.out.println(linhasComBaiano);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
