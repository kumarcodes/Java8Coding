package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapByValue {
    // Question: Sort a Map<String, Integer> by value in descending order using Java 8.

    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put("Math", 78);
        scoreMap.put("Science", 92);
        scoreMap.put("English", 85);
        scoreMap.put("History", 68);

        System.out.println("Question: Sort map by value in descending order using Java 8.");
        System.out.println("Sample input: " + scoreMap);
        // TODO: Write your Java 8 solution here.
    }
}
