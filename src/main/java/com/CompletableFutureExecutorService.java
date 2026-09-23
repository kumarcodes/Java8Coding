package com;

import java.util.concurrent.*;

public class CompletableFutureExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Executor Service Example
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future = executorService.submit(() -> "Data");
        String result = future.get();
        System.out.println(result);
        //CompletableFuture Example
        CompletableFuture.supplyAsync(() -> "Data").thenAccept(x -> System.out.println(x));
    }
}
