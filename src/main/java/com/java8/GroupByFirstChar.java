package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","banana","apricot","blueberry","cherry");
        Map<Character, Long> countMap = stringList.stream().
                collect(Collectors.groupingBy(x-> x.charAt(0),Collectors.counting()));
        System.out.println(countMap);
    }
}
