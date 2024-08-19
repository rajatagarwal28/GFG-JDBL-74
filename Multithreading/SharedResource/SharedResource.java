package Multithreading.SharedResource;

public class SharedResource {
    boolean itemAvailable = false;

    synchronized void addItem() {
        System.out.println("Adding new item");
        itemAvailable = true;
        System.out.println("Item is added by thread " + Thread.currentThread().getName());
        System.out.println("Notifying the consumer to resume consumption by " + Thread.currentThread().getName());

        notifyAll();
    }

    synchronized void removeItem() {
        System.out.println("Consuming item by " + Thread.currentThread().getName());
        while (!itemAvailable) {
            System.out.println("Item is removing by thread " + Thread.currentThread().getName());
            try {
                System.out.println("Waiting for item to remove by thread " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            itemAvailable = false;
            System.out.println("Item is removed by thread " + Thread.currentThread().getName());

        }
    }
}
