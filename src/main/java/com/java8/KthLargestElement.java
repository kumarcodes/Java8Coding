package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class KthLargestElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 6, 1, 5, 4, 9, 9);
        int k = 3;
        List<Integer> sortedList = integerList.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        Integer result = sortedList.stream().skip(k - 1).findFirst().get();
        System.out.println(result);
    }
}
