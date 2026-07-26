package com.topfifty;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 85);
        scoreMap.put("Bob", 92);
        scoreMap.put("Charlie", 78);
        //Approach 1
        scoreMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        //Approach 2
        Map<String, Integer> map = scoreMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));
        System.out.println(map);
    }
}
