package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class Anime {
    private final String name;

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        // Imutável, como as Strings
        // atributos desta lista também deve ser imutáveis
        List<Integer> numbers = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            numbers.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = numbers.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                numbers.remove(i);
                System.out.printf("%s removed %d\n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
        new Thread(runnableRemover).start();
    }
}
