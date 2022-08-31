package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        for (String string : list) {
            System.out.println(string);
        }
    }
}
