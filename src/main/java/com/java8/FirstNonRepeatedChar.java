package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "programming";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst().ifPresent(System.out::println);
    }
}
