package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
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

        System.out.println("-------------");
        Collections.sort(mangas);
        
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        
        System.out.println("------------");
        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
