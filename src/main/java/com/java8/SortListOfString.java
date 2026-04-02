package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {

    public static void main(String[] args) {
        List<String> brands = Arrays.asList("adidas", "zudio", "Puma", "nike", "airbnb");

        List<String> naturalOrder = sortNatural(brands);
        List<String> caseInsensitiveOrder = sortIgnoreCase(brands);
        List<String> reverseOrder = sortReverse(brands);

        System.out.println("Input list            : " + brands);
        System.out.println("Natural sort          : " + naturalOrder);
        System.out.println("Case-insensitive sort : " + caseInsensitiveOrder);
        System.out.println("Reverse sort          : " + reverseOrder);
    }

    // Default lexicographical sorting (uppercase letters come before lowercase).
    private static List<String> sortNatural(List<String> values) {
        return values.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // User-friendly sorting when input may contain mixed-case text.
    private static List<String> sortIgnoreCase(List<String> values) {
        return values.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    // Reverse sorting using a comparator.
    private static List<String> sortReverse(List<String> values) {
        return values.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
