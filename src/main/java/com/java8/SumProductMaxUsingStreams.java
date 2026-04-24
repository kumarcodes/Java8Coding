package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumProductMaxUsingStreams {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = integerList.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of given list of integers: " + sum.orElse(1));
        Optional<Integer> max = integerList.stream().reduce(Integer::max);
        System.out.println("Maximum of given list of integers: " + max.orElse(-1));
        Optional<Integer> product = integerList.stream().reduce((a, b) -> a * b);
        System.out.println("Product of given list of integers: " + product.orElse(1));
    }
}
