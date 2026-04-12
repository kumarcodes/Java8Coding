package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertListToUppercaseAndConcatenate {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        String result = stringList.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
