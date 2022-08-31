package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);

        mangas.add(new Manga(5L, "Shingeki no Kyojin", 24.5));
        mangas.add(new Manga(2L, "Berserk", 21.1));
        mangas.add(new Manga(3L, "Hellsing", 20.0));
        mangas.add(new Manga(1L, "One Piece", 17.5));
        mangas.add(new Manga(4L, "FullMetal", 12.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());

        System.out.println("--------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaX = new Manga(6L, "Hellsing", 20.0);
        System.out.println(Collections.binarySearch(mangas, mangaX, new MangaByIdComparator()));
    }
}
