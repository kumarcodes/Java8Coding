package com.capg;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Rohit";
        String s2 = "Sharma";
        String str = Stream.concat(Stream.of(s1), Stream.of(s2)).collect(Collectors.joining(" "));
        System.out.println(str);

    }
}
