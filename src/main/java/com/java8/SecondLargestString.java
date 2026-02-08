package com.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestString {
    public static void main(String[] args) {
        String str = "I am learning java8 streams apixdssf";
        String result = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed()).skip(2).findFirst().get();
        System.out.println(result);

    }

}
