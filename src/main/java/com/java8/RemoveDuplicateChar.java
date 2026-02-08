package com.java8;

import java.util.Arrays;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "abcdefad";
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}
