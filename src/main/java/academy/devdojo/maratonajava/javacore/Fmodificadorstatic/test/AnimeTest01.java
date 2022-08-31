package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("One Piece");
        Anime anime03 = new Anime("One Piece");

        anime01.printData();
        anime03.printData();
    }

}
