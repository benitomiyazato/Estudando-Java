package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class RemoveFromQueue implements Runnable {
    private final BlockingQueue<String> bq;

    public RemoveFromQueue(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is going to sleep for 2 seconds");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("Thread %s removendo valor %s da queue\n", Thread.currentThread().getName(), bq.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Kurohige");
        System.out.printf("Thread %s adicionou o valor %s a queue\n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Luffy");
        System.out.printf("Thread %s adicionou o valor %s a queue\n", Thread.currentThread().getName(), bq.peek());

    }
}
