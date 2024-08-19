package Multithreading.MonitorLock;

public class SharedResource {

    // this is owned by thread 1
    public synchronized void task1() {
        // thread 1 acquired the monitor lock on object
        System.out.println("Inside task1 by " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        try {
//            Thread.sleep(10000); //1sec
            wait();
//            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task1 - completed by: " + Thread.currentThread().getName());
    }

    // this is owned by thread 2

    public  void task2() {
        System.out.println("Inside task2 by " + Thread.currentThread().getName());
        //thread 2 is just blcked on this statement
        synchronized (this) {
            System.out.println("Inside task2 synchronised statement by thread: " + Thread.currentThread().getName());
            notifyAll();
        }
    }

    // this is owned by thread 3
    public void task3()  {
        System.out.println("Inside task3");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("task 3 completed");
    }
}
