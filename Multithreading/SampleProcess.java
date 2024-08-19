package Multithreading;

import java.util.ArrayList;
import java.util.List;

public class SampleProcess {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getPriority()); // 1--10
        Thread.currentThread().setPriority(10);

        MainThread md = new MainThread();
        List<Integer> lst = new ArrayList<>();
    }
}
