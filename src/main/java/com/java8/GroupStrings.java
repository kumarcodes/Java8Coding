package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStrings {
    public static void main(String[] args) {
        String[] strList = {"ewe", "aha", "jji", "kwk", "jhj"};
        System.out.print(Stream.of(strList).collect(Collectors.groupingBy(x -> x.substring(1, 2))));
    }
}
