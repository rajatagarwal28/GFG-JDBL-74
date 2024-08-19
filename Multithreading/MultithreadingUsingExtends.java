package Multithreading;

public class MultithreadingUsingExtends extends Thread {

    @Override
    public void run() {
        System.out.println("this is from run method of MultithreadingUsingExtends"
                + Thread.currentThread().getName());

    }
}
