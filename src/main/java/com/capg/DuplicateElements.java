package com.capg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 1, 3, 4, 2, 5, 1, 3);
        List<Integer> ansList = integerList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() >= 2)
                .map(Map.Entry::getKey).toList();
        System.out.println(ansList);
    }
}
