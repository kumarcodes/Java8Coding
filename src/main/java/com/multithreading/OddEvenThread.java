package com.multithreading;

//Print numbers from 1 to 30 in order.
// Odd numbers and Even Numbers should be printed into two different threads.
public class OddEvenThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 29; i = i + 2) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }

            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 30; i = i + 2) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {

                }
            }
        });
        t1.start();
        Thread.sleep(700);
        t2.start();
    }
}
