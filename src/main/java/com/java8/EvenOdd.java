package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
          List<List<Integer>> resultList = list.stream().
                collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                 .entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
