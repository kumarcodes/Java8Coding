package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RemoveNonNumericChar {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("rohi2t", "kuma1r", "sharma7", "coin1");
        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> resultList = stringList.stream()
                .map(x -> pattern.matcher(x).replaceAll("")).toList();
        System.out.println(resultList);
    }
}
