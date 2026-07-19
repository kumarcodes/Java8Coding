package com.java8;

import java.util.concurrent.CompletableFuture;

/**
 * Demonstrates CompletableFuture.supplyAsync with a chain of asynchronous
 * transformations using thenApplyAsync and a final consumer with thenAccept.
 *
 * supplyAsync(): runs the given Supplier asynchronously (ForkJoin common pool
 * by default). thenApplyAsync() performs the mapping steps asynchronously and
 * returns a new CompletableFuture for each stage. thenAccept() consumes the
 * final result. To guarantee completion before program exit, wait on the
 * terminal future (e.g., join()).
 */
public class SupplyAsyncExampleOne {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10);
        future.thenApplyAsync((x) -> x * 2).thenApplyAsync((x) -> x * 100)
                .thenAccept(x -> System.out.println(x));

    }
}
