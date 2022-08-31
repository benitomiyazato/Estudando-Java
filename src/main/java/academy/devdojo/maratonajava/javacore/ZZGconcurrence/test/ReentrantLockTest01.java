package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("Thread %s está em sessão crítica\n", name);
            System.out.printf("Há %d threads esperando na fila.\n", lock.getQueueLength());
            System.out.printf("Thread %s esperará 2 segundos.\n", name);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Deu capim na palheta");
        } finally {
            lock.unlock();
        }
    }

}

public class ReentrantLockTest01 {
    public static void main(String[] args) throws InterruptedException{
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(new Worker("A", lock));
        Thread t2 = new Thread(new Worker("B", lock));
        Thread t3 = new Thread(new Worker("C", lock));
        Thread t4 = new Thread(new Worker("D", lock));
        Thread t5 = new Thread(new Worker("E", lock));
        Thread t6 = new Thread(new Worker("F", lock));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();

        System.out.println("FIM");
    }
}