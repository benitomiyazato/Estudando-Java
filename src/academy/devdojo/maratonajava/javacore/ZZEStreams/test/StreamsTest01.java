package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest01 {
    // 1. Order all light novels by title
    // 2. Retrieve the first three light novel with price less than 4
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("FullMetal Alchemist", 5.99)));

    public static void main(String[] args) {
        List<LightNovel> firstFourLightNovelsByPrice = getFirstFourByPrice(lightNovels, l -> l.getPrice() <= 4);
        printList(firstFourLightNovelsByPrice);
    }

    private static void printList(List<LightNovel> list) {
        for (LightNovel lightNovel : list) {
            System.out.println("Title: " + lightNovel.getTitle());
            System.out.println("Price: " + lightNovel.getPrice());
            System.out.println("------------------------");
        }
    }

    private static <T, U> List<LightNovel> getFirstFourByPrice(List<LightNovel> lightNovelList,
            Predicate<LightNovel> predicate) {
        List<LightNovel> sorteredList = new ArrayList<>();
        sorteredList.addAll(lightNovelList);
        sorteredList.sort((lightNovel1, lightNovel2) -> Double.compare(lightNovel1.getPrice(), lightNovel2.getPrice()));

        List<LightNovel> filteredList = new ArrayList<>();
        for (LightNovel lightNovel : sorteredList) {
            if (predicate.test(lightNovel)) {
                filteredList.add(lightNovel);
            }
            if (filteredList.size() >= 4) {
                break;
            }
        }
        return filteredList;
    }
}
