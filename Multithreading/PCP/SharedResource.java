package Multithreading.PCP;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int maxBufferSize;

    SharedResource(int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.maxBufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (sharedBuffer.size() == maxBufferSize) {
            System.out.println("Buffer is full, waiting for item");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Item is Produced " + item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is Empty, waiting for producer to produce");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Item consumed is :  " +  item);
        System.out.println("Notifying the producer to produce more");
        notifyAll();
        return item;
    }


}
