package Multithreading.CustomLock.StampedLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        StampedLock lock = new StampedLock(); // optimistic

        Thread th1 = new Thread(
                () -> {
                    sharedResource1.producer(lock);
                }
        );

        Thread th2 = new Thread(
                () -> {
                    sharedResource1.producer(lock);
                }
        );


//        SharedResource sharedResource2 = new SharedResource();
//        Thread th3 = new Thread(() -> {
//            sharedResource2.consumer(lock);
//        });

        th1.start();
        th2.start();
//        th3.start();
    }

}
