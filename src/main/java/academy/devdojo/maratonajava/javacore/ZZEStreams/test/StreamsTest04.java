package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "no", "Mi");
        List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters);
    }
}
