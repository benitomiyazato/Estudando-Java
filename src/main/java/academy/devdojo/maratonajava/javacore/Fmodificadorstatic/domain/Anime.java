package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int i : episodes) {
            System.out.print(i + " ");
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(this.name);
    }
}
