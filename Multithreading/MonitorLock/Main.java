package Multithreading.MonitorLock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();


//        MonitorLockDemo monitorLockDemoObj2 = new MonitorLockDemo();
//        MonitorLockDemo monitorLockDemoObj3 = new MonitorLockDemo();

        Thread thread1 = new Thread(() -> {sharedResource.task1();});

        Thread thread2 = new Thread(() -> {sharedResource2.task1();});

        //Inside task1 by Thread-0
        //Inside task1 by Thread-1
        //Task1 - completed by: Thread-1
        //Task1 - completed by: Thread-0

//        Thread thread3 = new Thread(() -> {sharedResource.task3();});

        thread1.start();
        thread2.start();
//        thread3.start();
    }

}
