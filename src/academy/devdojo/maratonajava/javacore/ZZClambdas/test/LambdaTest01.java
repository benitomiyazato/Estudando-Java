package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("William", "Suane", "Devdojo", "Academy");
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        forEach(names, name -> System.out.print(name + " "));
        forEach(nums, num -> System.out.print(num + " "));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
