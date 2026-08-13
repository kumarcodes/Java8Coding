package com.java8;

import java.util.Arrays;

public class WordLengthCounter {
    public static void main(String[] args) {
        String str = "rohit kumar sharma rks dm";
        Arrays.stream(str.split(" ")).map(String::toUpperCase).filter(x -> x.length() < 4)
                .forEach(System.out::println);

    }
}
