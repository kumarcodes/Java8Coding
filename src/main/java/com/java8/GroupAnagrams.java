package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tea", "ate", "silent", "listen", "rohit");
        Collection<List<String>> resultList = list.stream().
                collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                        .collect(Collectors.toList()))).values();
        System.out.println(resultList);
    }


}
