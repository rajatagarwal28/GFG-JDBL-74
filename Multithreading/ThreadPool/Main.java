package Multithreading.ThreadPool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 4, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectHandler()
//                new ThreadPoolExecutor.DiscardPolicy()
        );
        threadPoolExecutor.allowCoreThreadTimeOut(true);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threadPoolExecutor.submit(
                    () -> {
                        System.out.println("Task: " + String.valueOf(finalI) + " processed by : " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Task: " + String.valueOf(finalI) + " completed by : " + Thread.currentThread().getName());
                    }

            );
        }


    }


}

