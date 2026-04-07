package com.java8;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("rohit", "kumar", "sharma");
        List<String> resultList = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(resultList);
    }
}
