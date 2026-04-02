package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Q1HighestWord {
    public static void main(String[] args) {
        String sentence = "Java streams are powerful concept";
        List<String> stringList = new ArrayList<>();
        stringList = List.of(sentence.split(" "));

        Optional<String> highestLengthWordsUsingFilter = findHighestLengthWordsUsingFilter(stringList);
        List<String> highestLengthWords = findHighestLengthWords(stringList);
        System.out.println("Highest length word(s) Approach 1 using filter: " + highestLengthWordsUsingFilter);
        System.out.println("Highest length word(s) Approach 2 using groupingBy: " + highestLengthWords);
    }

    //Approach 1 using filter
    private static Optional<String> findHighestLengthWordsUsingFilter(List<String> stringList) {
        return stringList.stream().max(Comparator.comparingInt(String::length));
    }


    //Approach 2 using groupingBy
    private static List<String> findHighestLengthWords(List<String> stringList) {
        Map<Integer, List<String>> resultMap = stringList.stream()
                .collect(Collectors.groupingBy(String::length));

        int maxLength = 0;
        for (Integer key : resultMap.keySet()) {
            if (key > maxLength) {
                maxLength = key;
            }
        }

        System.out.println(resultMap);
        return resultMap.get(maxLength);
    }
}
