package com.java8;

import java.util.Arrays;
import java.util.List;

public class SplitSentenceToWord {
    public static void main(String[] args) {
        List<String> sentenceList = Arrays.asList("Java World", "Rohit Sharma", "LTIMindtree explore world");
        List<String> stringList = sentenceList.stream()
                .flatMap(x -> Arrays.stream(x.split(" "))).toList();
        System.out.println(stringList);
    }
}
