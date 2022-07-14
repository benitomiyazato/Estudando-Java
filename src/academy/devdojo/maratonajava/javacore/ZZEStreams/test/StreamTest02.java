package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest02 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Baiano Deus", "Linguine");
        List<String> developers = List.of("William Suane", "David", "Harisson");
        List<String> students = List.of("Alo ASDA", "1231234estudante", "estudande blapalbnlasc");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
