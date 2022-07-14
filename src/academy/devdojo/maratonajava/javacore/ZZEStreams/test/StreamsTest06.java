package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.List;
import java.util.Optional;

public class StreamsTest06 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        Integer numsSum = nums.stream()
                .reduce(0, (n1, n2) -> n1 + n2); // sem method reference
        System.out.println(numsSum);

        Integer sumMethodReference = nums.stream()
                .reduce(0, Integer::sum); // reduce recebe um binary operator
                                          // Integer.sum(a, b) é um binary operator
                                          // identity é um valor inicial
        System.out.println(sumMethodReference);

        /*-------------------------------------------------------------------------------------------*/

        System.out.println(nums.stream()    // calcula o maior número da stream
                .reduce(0, Integer::max));

    }
}
