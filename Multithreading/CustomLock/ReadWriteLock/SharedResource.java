package Multithreading.CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReadWriteLock lockObj) {
        try {
            lockObj.readLock().lock();
            System.out.println("Read Lock acquired by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lockObj.readLock().unlock();
            System.out.println("Read Lock released by : "+ Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lockObj){
        try {
            lockObj.writeLock().lock();
            System.out.println("Write Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Write Lock released by : "+ Thread.currentThread().getName());
            lockObj.writeLock().unlock();
        }
    }
}
