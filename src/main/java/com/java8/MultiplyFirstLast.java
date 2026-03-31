package com.java8;

import java.util.stream.IntStream;

public class MultiplyFirstLast {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3,5, 4, 5};
        IntStream.range(0, arr.length / 2).map(x -> (arr[x] * arr[arr.length - x - 1]))
                .forEach(System.out::println);
    }
}
