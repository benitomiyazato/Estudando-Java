package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Luffy", "Zoro", "Sanji", "Usopp"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        int integerFromString = stringToInteger.apply("1234");
        System.out.println(integerFromString);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Zoro"));

    }
}
