package com.topfifty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 1, 2, 3, 5, 6);
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " ");

            }
        }
        list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
