package com.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all the elements:" + sum);
    }
}
