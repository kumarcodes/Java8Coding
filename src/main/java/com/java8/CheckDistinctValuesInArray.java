package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckDistinctValuesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 7, 9, 0};
        List<Integer> integerList = Arrays.stream(arr).boxed().toList();
        Map<Integer, Long> countMap = integerList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        boolean distinctChecker = countMap.values().stream().noneMatch(x -> x > 1);
        System.out.println("Given array contains distinct elements: " + distinctChecker);
    }
}
