package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " beep");
        };
        // executor.schedule(r, 5, TimeUnit.SECONDS);
        /*
         * executor.scheduleAtFixedRate = continuo, se a thread dorme ele continua
         * contando o delay
         */

        /*
         * executor.scheduleWithFixedDelay -> conta a partir do momento que a thread
         * acorda
         */
        ScheduledFuture<?> scheduledExecutor = executor.scheduleAtFixedRate(r, 0, 1, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("Cancelling scheduledExecutor");
            scheduledExecutor.cancel(false);
            executor.shutdown();
        }, 5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beeper();
    }
}
