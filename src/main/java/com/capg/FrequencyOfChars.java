package com.capg;

import java.util.Arrays;
import java.util.Map;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "swiss";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).forEach(System.out::println);
        Map<Character, Long> countMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(countMap);
    }
}
