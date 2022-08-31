package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(100)
                .forEach(System.out::println);

        System.out.println("---------");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1000))
                .limit(100)
                .forEach(System.out::println);

    }
}
