package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrence {
    public static void main(String[] args) {
        String str = "I am learning Streams API in Java Java";
        Map<String, Long> countMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(countMap);
    }
}
