package com.multithreading;

public class ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name inside run method: " + Thread.currentThread().getName());
                System.out.println("Priority of this thread is: " + Thread.currentThread().getPriority());
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setName("New Worker Thread");
        System.out.println("Thread Name before start: " + Thread.currentThread().getName());
        thread.start();
        System.out.println("Thread name after start: " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
