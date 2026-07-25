package com.topfifty;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCaseJoin {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
