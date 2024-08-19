package Multithreading.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(() -> {sharedResource.removeItem();});


        consumerThread.start();

        producerThread.start();

    }
}
