package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Roronoa Zoro", "Monkey D. Luffy");
        List<Integer> lenghts = map(names, name -> name.length());
        List<String> toUpperCase = map(names, name -> name.toUpperCase());
        System.out.println(lenghts);
        System.out.println(toUpperCase);

        List<Integer> lenghtWithoutBlankSpaces = map(names, name -> (name.replaceAll("\\s+", "")).length());
        System.out.println(lenghtWithoutBlankSpaces);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
