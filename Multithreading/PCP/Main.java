package Multithreading.PCP;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    sharedResource.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                sharedResource.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        consumerThread.start();
        producerThread.start();

    }
}
