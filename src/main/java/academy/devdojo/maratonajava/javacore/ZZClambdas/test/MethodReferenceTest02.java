package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.service.AnimeComparators;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(
                List.of(new Anime("One Piece", 1015), new Anime("Zaruto Shippuden", 730),
                        new Anime("FullMetal BrotherHood", 64)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
