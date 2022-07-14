package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                map.put(key, value);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> getKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }

    public class ReentrantReadWriteLockTest01 {
        public static void main(String[] args) {
            ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
            MapReadWrite mapReadWrite = new MapReadWrite(rwl);

            Runnable writer = () -> {
                for (int i = 0; i < 20; i++) {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                }
            };

            Runnable reader = () -> {
                if (rwl.isWriteLocked()) {
                    System.out.println("RWL WRITE LOCKED");
                }
                rwl.readLock().lock();
                System.out.println("Got the lock");
                try {
                    System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.getKeys());
                } finally {
                    rwl.readLock().unlock();
                }
            };

            Thread t1 = new Thread(writer);
            Thread t2 = new Thread(reader);
            Thread t3 = new Thread(reader);

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
