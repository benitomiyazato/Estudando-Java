package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * Quando usar parallel Streams:
 * recomendado o uso de Benchmarks para determinar melhor se há uma melhor performance com uso de multiplas threads
 * 
 * Tomar cuidado com boxing/unboxing
 * 
 * Algumas operações de streams não podem ser feitas paralelamente (find first | limit)
 * 
 * Levar em conta o custo da computação N para elementos e P para processamentos
 * o uso de multiplas threads é recomendado quando a quantidade de processamentos é grande
 * 
 * não vale a pena usar parallel streams caso a quantidade de dados não for tão grande
 * 
 * levar em conta os tipos de coleções
 * 
 * streams com tamanhos pre-definidos são melhores para trabalhar paralelamente
 * 
 */
public class StreamsTest15 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStream(num);
        sumParallelStream(num);
        sumLongStreamIterate(num);
        sumLongParallelStream(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for:");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStream(long num) {
        System.out.println("Sum stream iterate:");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStream(long num) {
        System.out.println("Sum stream iterate:");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum stream iterate:");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongParallelStream(long num) {
        System.out.println("Sum stream iterate:");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
