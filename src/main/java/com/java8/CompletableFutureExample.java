package com.java8;

import java.util.concurrent.CompletableFuture;

/**
 * Demonstrates simple usages of CompletableFuture: supplyAsync and runAsync.
 * <p>
 * supplyAsync: runs a Supplier that produces a result and returns a
 * CompletableFuture<T>. The example calls join() to wait for the result.
 * <p>
 * runAsync: runs a Runnable that does not produce a result and returns a
 * CompletableFuture<Void>. Because runAsync is non-blocking, the program may
 * exit before the task completes unless the future is awaited (e.g., join()).
 */
public class CompletableFutureExample {
    public static void main(String[] args) {
        // supplyAsync(): accepts a Supplier<T> and runs it asynchronously (by default
        // using the ForkJoinPool.commonPool()). It returns a CompletableFuture<T>
        // that will complete with the supplier's result. Calling join() blocks the
        // current thread until the result is available (and will rethrow exceptions).
        CompletableFuture<String> supplyAsyncFuture = CompletableFuture.supplyAsync(() -> "Hello supplyAsync World!");
        System.out.println(supplyAsyncFuture.join());
        // runAsync(): accepts a Runnable and runs it asynchronously, returning a
        // CompletableFuture<Void>. Because it doesn't produce a value, you must
        // still wait on the returned future (e.g., join()) if you need to ensure
        // the task completes before program exit.
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(() -> System.out.println("Hello runAsync World!"));
        runAsyncFuture.join();
    }
}
