package Multithreading.ThreadPool;

import java.util.concurrent.*;

public class TPExecutor {

    Executor executor;
    ExecutorService executorService;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(4), new CustomThreadFactory());
//        threadPoolExecutor.submit(); // it starts
//        threadPoolExecutor.shutdown();// it terminate once all task under execution completes
//        threadPoolExecutor.shutdownNow();
        threadPoolExecutor.allowCoreThreadTimeOut(true);

        for (int i = 0; i < 9; i++) {
            int finalI = i;
            threadPoolExecutor.submit(
                    () -> {
                        System.out.println("Task: " + String.valueOf(finalI) + " processed by : " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(5000);// 5 sec
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Task: " + String.valueOf(finalI) + " completed by : " + Thread.currentThread().getName());
                    }
            );
        }
        threadPoolExecutor.shutdownNow();
    }



}
