package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar8 {

    public static void main(String[] args) {
        // Sample input used to demonstrate all three counting approaches.
        String str = "Mississippi";

        // Run approach 1: groupingBy + counting collector.
        Map<Character, Long> approach1 = countWithGroupingBy(str);
        // Run approach 2: toMap with merge function.
        Map<Character, Long> approach2 = countWithToMapMerge(str);
        // Run approach 3: manual map updates via merge.
        Map<Character, Long> approach3 = countWithManualMap(str);

        // Print result from approach 1.
        printResult("1) groupingBy + counting", approach1);
        // Print result from approach 2.
        printResult("2) toMap with merge", approach2);
        // Print result from approach 3.
        printResult("3) manual map update", approach3);
    }

    private static Map<Character, Long> countWithGroupingBy(String input) {
        // Convert to lower case so uppercase/lowercase letters are counted together.
        return input.toLowerCase()
                // Convert the string into an IntStream of character code points.
                .chars()
                // Convert each int code point into a Character object.
                .mapToObj(c -> (char) c)
                // Group by character key and count occurrences while keeping insertion order.
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    }

    private static Map<Character, Long> countWithToMapMerge(String input) {
        // Convert to lower case for case-insensitive counting.
        return input.toLowerCase()
                // Stream each character as an int code point.
                .chars()
                // Convert each code point to Character for map keys.
                .mapToObj(c -> (char) c)
                // Build a map where each character starts with 1 and duplicates are summed.
                .collect(Collectors.toMap(
                        // Use the character itself as the key.
                        Function.identity(),
                        // Initial value for first occurrence of a character.
                        c -> 1L,
                        // Merge function for duplicate keys: add old and new counts.
                        Long::sum,
                        // Preserve first-seen order of characters.
                        LinkedHashMap::new
                ));
    }

    private static Map<Character, Long> countWithManualMap(String input) {
        // Create a map to hold character frequencies in insertion order.
        Map<Character, Long> countMap = new LinkedHashMap<>();
        // Lowercase input, split into single-character strings, then stream them.
        Arrays.stream(input.toLowerCase().split(""))
                // Convert each one-character string to a Character.
                .map(s -> s.charAt(0))
                // Increment count for each character using merge.
                .forEach(ch -> countMap.merge(ch, 1L, Long::sum));
        // Return the completed frequency map.
        return countMap;
    }

    private static void printResult(String title, Map<Character, Long> countMap) {
        // Print approach title and corresponding frequency map.
        System.out.println(title + " => " + countMap);
    }
}
