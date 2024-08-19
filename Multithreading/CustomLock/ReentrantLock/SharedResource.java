package Multithreading.CustomLock.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    // Thread 1 -> wants to run producer function then thread 1 have to acquire the monitor lock of object1.

    public synchronized void producer(ReentrantLock lockObj){
        lockObj.lock(); // acquire the lock
        try {
            System.out.println("Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000); // 4sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Lock released by : "+ Thread.currentThread().getName());
            lockObj.unlock(); // releases the lock
        }

    }

    // Thread 2 -> wants to run consumer function then thread 2 have to acquire the monitor lock of object1.
    //    public synchronized void consumer() {
    //        //do  nothing
    //
    //    }
}
