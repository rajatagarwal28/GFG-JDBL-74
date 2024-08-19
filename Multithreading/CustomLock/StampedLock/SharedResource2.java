package Multithreading.CustomLock.StampedLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource2 {
    boolean isAvailable = false;
    int a = 10;

    public void producer(StampedLock lock){
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Read Lock acquired by : "+ Thread.currentThread().getName());
//            a = 20;
            if(lock.validate(stamp)) {
                a = 20;
                System.out.println("Updated successfullly");
            } else {
                System.out.println("Rollback is needed");
//                a = 10;
            }
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void update(int value, StampedLock lock) {
        long version = lock.writeLock();
        a = value;
        lock.unlockWrite(version);
    }
   // update(10, lockObj); -> Thread1
   // update(20, lockObj); -> Thread2

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
