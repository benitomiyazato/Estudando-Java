package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        List<String> nomes2 = new ArrayList<String>();

        nomes.add("baiano");
        nomes.add("a");
        nomes.add("b");
        nomes.add("c");

        nomes2.add("d");
        nomes2.add("c");
        nomes2.add("c");
        nomes2.add("b");
        nomes2.add("e");
        nomes2.add("f");
        nomes2.add("g");
        nomes2.add("baiano");

        for (String nome2 : nomes2) {
            if (!nomes.contains(nome2)) {
                nomes.add(nome2);
            }
        }
        System.out.println(nomes);
    }
}
