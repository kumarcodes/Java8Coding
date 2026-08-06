package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class SecondUniqueChar {
    public static void main(String[] args) {
        String str = "rohit sharma";
        String secondUniqueChar = Arrays.stream(str.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).skip(1).findFirst().map(String::valueOf).orElse("No second unique character found");

        System.out.println(secondUniqueChar);
    }
}
