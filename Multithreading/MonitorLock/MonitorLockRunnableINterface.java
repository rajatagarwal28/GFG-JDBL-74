package Multithreading.MonitorLock;

public class MonitorLockRunnableINterface implements Runnable{

    @Override
    public void run() {
        SharedResource demo = new SharedResource();
        demo.task1();
    }
}
