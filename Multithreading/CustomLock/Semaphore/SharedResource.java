package Multithreading.CustomLock.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    int isAvailableCount = 1;


    // Thread 1 -> wants to run producer function then thread 1 have to acquire the monitor lock of object1.

    public synchronized void producer(Semaphore lock){
        try {
            lock.acquire();// acquire the lock
            System.out.println("Lock acquired by : "+ Thread.currentThread().getName());
            isAvailableCount++;
            Thread.sleep(4000); // 4sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Lock released by : "+ Thread.currentThread().getName());
            lock.release(); // releases the lock
            System.out.println("Current value of isAvailableCount is : "+ isAvailableCount);
        }

    }

    // Thread 2 -> wants to run consumer function then thread 2 have to acquire the monitor lock of object1.
    //    public synchronized void consumer() {
    //        //do  nothing
    //
    //    }
}
