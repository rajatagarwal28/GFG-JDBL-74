package Multithreading.CustomLock.StampedLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(StampedLock lock){
        long version = lock.readLock();
            lock.validate(version);
        try {
            System.out.println("Read Lock acquired by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlockRead(version);
            System.out.println("Read Lock released by : "+ Thread.currentThread().getName());
        }
    }

    public void consumer(StampedLock lock){
        long stamp = lock.writeLock();
        try {
            System.out.println("Write Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock released by : "+ Thread.currentThread().getName());
        }
    }
}
