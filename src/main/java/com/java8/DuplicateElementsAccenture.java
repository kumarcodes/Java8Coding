package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElementsAccenture {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 5, 7, 2, 5);
        Map<Integer, Long> countMap = numbers.stream().
                collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
            if (entry.getValue() != null && entry.getValue() > 1L)
                System.out.println(entry.getKey());
        }
    }
}
