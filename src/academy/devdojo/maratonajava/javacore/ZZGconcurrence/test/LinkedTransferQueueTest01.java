package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> objects = new LinkedTransferQueue<>();
        System.out.println(objects.add("Wiliiam")); // nao há esp. disponivel-> throws exception

        System.out.println(objects.offer("Wiliiam", 10, TimeUnit.SECONDS)); // nao há esp. disponivel-> returns false e
                                                                            // não adiciona o item

        objects.put("William"); // se não há espaço, apenas espera para poder inserir assim que abrir espaço na
                                // queue

        objects.take(); // retorna e retira o objeto da queue, caso a queue estiver vazia aguarda até
                        // que haja um novo elemento

        System.out.println(objects.remainingCapacity()); // 2147483647
    }
}
