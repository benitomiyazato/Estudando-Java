package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Shingeki no Kyojin");
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("One Piece");
        mangas.add("FullMetal");

        for (String manga : mangas) {
            System.out.print(manga+" ");

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        Collections.sort(mangas);
        
        for (String manga : mangas) {
            System.out.println(manga);
            System.out.println("------------------------------");
        }
    }
}
