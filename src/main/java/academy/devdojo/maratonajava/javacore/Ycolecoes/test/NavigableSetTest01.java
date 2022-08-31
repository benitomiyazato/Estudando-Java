package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

class SmartphoneComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }

}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparator());
        Smartphone sm1 = new Smartphone("123", "Xaolin");
        Smartphone sm2 = new Smartphone("122", "Baianomon");
        set.add(sm1);
        set.add(sm2);
        System.out.println(set);
        System.out.println("----------------");

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Shingeki no Kyojin", 24.5, 0));
        mangas.add(new Manga(2L, "Berserk", 21.1, 5));
        mangas.add(new Manga(3L, "Hellsing", 20.0, 0));
        mangas.add(new Manga(1L, "One Piece", 17.5, 2));
        mangas.add(new Manga(4L, "FullMetal", 12.9, 0));
        mangas.add(new Manga(6L, "FullMetal", 12.9, 0));

        for (Manga manga : mangas) { // .descendingSet()
            System.out.println(manga);
        }

        Manga digimon = new Manga(7L, "Digimon", 17.5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("----------------");
        System.out.println(mangas.floor(digimon));
        System.out.println("----------------");

        System.out.printf("Tamanho inicial: %d\n", mangas.size());
        Manga mangaRemovido = mangas.pollFirst();
        System.out.printf("Tamanho final: %d\n", mangas.size());
        System.out.println("Manga removido: " + mangaRemovido);

        System.out.println("--------------");

        System.out.printf("Tamanho inicial: %d\n", mangas.size());
        mangaRemovido = mangas.pollFirst();
        System.out.printf("Tamanho final: %d\n", mangas.size());
        System.out.println("Manga removido: " + mangaRemovido);
    }
}
