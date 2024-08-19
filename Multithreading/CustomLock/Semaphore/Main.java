package Multithreading.CustomLock.Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        Semaphore lock = new Semaphore(2);

        Thread producerThread1 = new Thread(() -> {
            sharedResource1.producer(lock);
        });

        Thread producerThread2 = new Thread(() -> {
            sharedResource1.producer(lock);
        });

        Thread producerThread3 = new Thread(() -> {
            sharedResource1.producer(lock);
        });

        Thread oneThreadOfThePool = new Thread();
        Thread twoThreadOfThePool = new Thread();
        Thread threeThreadOfThePool = new Thread();


        Runnable r = () -> {
            sharedResource1.producer(lock);
        };

        Thread producerThread4 = new Thread(() -> {
            sharedResource1.producer(lock);
        });

        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        producerThread4.start();

    }
}
