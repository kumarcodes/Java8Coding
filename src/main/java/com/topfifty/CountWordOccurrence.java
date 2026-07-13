package com.topfifty;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurrence {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog the fox runs";
        Map<String, Long> countMap = countWordOccurrence(str);
        System.out.println(countMap);
        for (Map.Entry<String, Long> entry : countMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + "-> " + "Occurrence: " + entry.getValue());
        }

    }

    private static Map<String, Long> countWordOccurrence(String str) {
        Map<String, Long> countMap = Arrays.stream(str.toLowerCase()
                        .replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+"))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return countMap;
    }
}
