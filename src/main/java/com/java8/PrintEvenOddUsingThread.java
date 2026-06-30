package com.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenOddUsingThread {
    private static volatile boolean isOddTrue = true;

    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(2);
        Runnable printOdd = () -> {
            for (int i = 1; i <= 20; i = i + 2) {
                synchronized (PrintEvenOddUsingThread.class) {
                    while (!isOddTrue) {
                        try {
                            PrintEvenOddUsingThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd number" + i + "-" + Thread.currentThread().getName());
                    isOddTrue = false;
                    PrintEvenOddUsingThread.class.notify();
                }
            }
        };
        Runnable printEven = () -> {
            for (int i = 2; i <= 20; i = i + 2) {
                synchronized (PrintEvenOddUsingThread.class) {
                    while (isOddTrue) {
                        try {
                            PrintEvenOddUsingThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even number" + i + "-" + Thread.currentThread().getName());
                    isOddTrue = true;
                    PrintEvenOddUsingThread.class.notify();
                }
            }
        };
        executer.submit(printEven);
        executer.submit(printOdd);
        executer.shutdown();

    }
}
