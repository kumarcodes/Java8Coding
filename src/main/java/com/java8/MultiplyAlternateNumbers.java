package com.java8;

import java.util.stream.IntStream;

public class MultiplyAlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 6, 7, 2};
        int result = IntStream.range(0, arr.length).filter(x -> x % 2 == 0).
                map(x -> arr[x]).reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
