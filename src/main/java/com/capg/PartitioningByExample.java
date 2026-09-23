package com.capg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> resultMap = integerList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(resultMap);
    }
}
