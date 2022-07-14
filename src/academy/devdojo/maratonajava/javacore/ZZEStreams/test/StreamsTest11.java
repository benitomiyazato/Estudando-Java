package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE),
            new LightNovel("FullMetal Alchemist", 5.99, Category.FANTASY)));

    public static void main(String[] args) {
        // Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        // List<LightNovel> fantasy = new ArrayList<>();
        // List<LightNovel> drama = new ArrayList<>();
        // List<LightNovel> romance = new ArrayList<>();

        // for (LightNovel lightNovel : lightNovels) {
        // switch (lightNovel.getCategory()) {
        // case DRAMA:
        // drama.add(lightNovel);
        // break;
        // case FANTASY:
        // fantasy.add(lightNovel);
        // break;
        // case ROMANCE:
        // romance.add(lightNovel);
        // break;
        // }
        // }

        // categoryLightNovelMap.put(Category.DRAMA, drama);
        // categoryLightNovelMap.put(Category.ROMANCE, romance);
        // categoryLightNovelMap.put(Category.FANTASY, fantasy);
        // System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> lightNovelCategoryMap = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(lightNovelCategoryMap);

    }
}
