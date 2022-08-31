package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.service.AnimeComparators;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(
                List.of(new Anime("One Piece", 1015), new Anime("Zaruto Shippuden", 730),
                        new Anime("FullMetal BrotherHood", 64)));

        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println("BY TITLE: \n" + animeList + "\n-----------------------------");
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println("BY EPISODES: \n" + animeList + "\n-----------------------------");
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println("BY TITLE: \n" + animeList + "\n-----------------------------");

    }
}
