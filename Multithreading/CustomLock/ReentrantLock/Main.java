package Multithreading.CustomLock.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        SharedResource sharedResource1 = new SharedResource();
        Thread producerThread1 = new Thread(() -> {
            sharedResource1.producer(lock);
        });

        SharedResource sharedResource2 = new SharedResource();
        Thread producerThread2 = new Thread(() -> {
            sharedResource2.producer(lock);
        });

        producerThread1.start();
        producerThread2.start();
    }
}
