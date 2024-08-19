package Multithreading.CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

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


        SharedResource sharedResource2 = new SharedResource();
        Thread th3 = new Thread(() -> {
            sharedResource2.consumer(lock);
        });
//        Thread th4 = new Thread(() -> {
//            sharedResource2.consumer(lock);
//        });

        th1.start();
        th2.start();
        th3.start();
//        th4.start();
    }

}
