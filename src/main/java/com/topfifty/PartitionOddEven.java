package com.topfifty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOddEven {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> result = numberList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(result);
    }
}
