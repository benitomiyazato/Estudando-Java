package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        for (String string : queue) {
            System.out.println(string);
        }

        // peek retorna o primeiro elemento da queue
        // poll remove o primeiro elemento da queue
        /*
         * offer funciona como um add, mas nao lança exceção caso atinja o tamanho
         * limite
         */

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
        }
        System.out.println(queue);
    }
}
