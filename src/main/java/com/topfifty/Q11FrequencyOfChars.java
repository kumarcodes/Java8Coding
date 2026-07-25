package com.topfifty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11FrequencyOfChars {
    public static void main(String[] args) {
        String str = "programming";
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Map<Character, Long> countMap = str.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
        System.out.println(countMap);
    }
}
