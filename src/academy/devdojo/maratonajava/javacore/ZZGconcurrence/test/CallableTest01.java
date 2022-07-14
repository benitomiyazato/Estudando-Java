package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

class RandomNumberGenerator implements Callable<String> {

    @Override
    public String call() throws Exception {
        // ThreadLocalRandom é melhor para gerar numeros aleatorios em multiplas threads
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable...\n", Thread.currentThread().getName(), i);
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), num);
    }

}

public class CallableTest01 {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> futureString = executorService.submit(rng);

        try {
            String s = futureString.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}
