package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.service.AnimeComparators;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(
                List.of(new Anime("One Piece", 1015), new Anime("Zaruto Shippuden", 730),
                        new Anime("FullMetal BrotherHood", 64)));

    }
}
