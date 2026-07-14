package com.java8;

public class PrintOddEvenUsingThread {
    // Shared counter used by both threads; starts at 1
    private int num = 1;
    // Upper bound (inclusive) for printing
    private final int limit = 10;

    public static void main(String[] args) {
        // Create a shared printer instance used by both threads
        PrintOddEvenUsingThread printer = new PrintOddEvenUsingThread();
        // Create threads using method references. Note: variable names (printOdd/printEven)
        // are just identifiers; the method references determine actual behavior.
        Thread printOdd = new Thread(printer::evenNum, "Even Thread");
        Thread printEven = new Thread(printer::oddNum, "Odd Thread");
        // Start threads — they coordinate via wait()/notify() inside the methods
        printOdd.start();
        printEven.start();
    }

    public synchronized void oddNum() {
        // This method prints odd numbers. It's synchronized so only one thread
        // can execute the critical section at a time and uses wait()/notify() to
        // hand control to the other thread when needed.
        while (num <= limit) {
            // If it's not this thread's turn (num is even), wait until notified
            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // Print and advance the counter, then notify the other thread
            if (num < limit) {
                System.out.println(Thread.currentThread().getName() + " " + num);
                num++;
                notify();
            }
        }
    }

    public synchronized void evenNum() {
        // This method prints even numbers. It mirrors oddNum() but waits for
        // num to be even before printing. Synchronization and wait/notify are used
        // to coordinate alternating output between threads.
        while (num <= limit) {
            // If it's not this thread's turn (num is odd), wait until notified
            while (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // Print and advance the counter, then notify the other thread
            if (num <= limit) {
                System.out.println(Thread.currentThread().getName() + " " + num);
                num++;
                notify();
            }
        }
    }

}
