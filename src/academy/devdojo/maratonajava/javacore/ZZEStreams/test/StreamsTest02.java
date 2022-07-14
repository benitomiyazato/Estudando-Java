package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("FullMetal Alchemist", 5.99)));

    public static void main(String[] args) {
        List<String> filteredList = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(4)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }
}
