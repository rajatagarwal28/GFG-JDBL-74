package Multithreading;
import java.lang.Thread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

//        System.out.println(Thread.currentThread().toString());
//        System.out.println(Thread.currentThread().threadId());
//        System.out.println(Thread.currentThread().getThreadGroup());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isDaemon());
//        Thread -> 2 types -> 1. User Thread 2. Daemon thread

//        System.out.println(Thread.currentThread().isInterrupted());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getState());
//
//
//        System.out.println("---------");
//
//
//        MultithredingDemo md = new MultithredingDemo();
//        md.start();
//        System.out.println("---------");

        MulltithreadingUsingInterface mt = new MulltithreadingUsingInterface();
        Thread threadObj = new Thread(mt);
        threadObj.setDaemon(true);// this created a thread with state new

        threadObj.start();

//        MultithreadingUsingExtends mt2 = new MultithreadingUsingExtends();
//        mt2.start();

    }
}
