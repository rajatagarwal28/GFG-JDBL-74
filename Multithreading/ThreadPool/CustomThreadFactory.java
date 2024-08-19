package Multithreading.ThreadPool;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(false);
        thread.setPriority(Thread.NORM_PRIORITY);
//        thread.setName("Custom Thread");
        return thread;
    }
}
