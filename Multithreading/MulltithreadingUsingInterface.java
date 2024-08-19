package Multithreading;

import java.util.concurrent.locks.LockSupport;

public class MulltithreadingUsingInterface implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());// Instruction - 11
        System.out.println("Hi");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");
    }

}

