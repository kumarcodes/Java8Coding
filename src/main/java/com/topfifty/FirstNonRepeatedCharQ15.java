package com.topfifty;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharQ15 {
    public static void main(String[] args) {
        String str = "swiss";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).findFirst().ifPresent(System.out::println);
    }
}
