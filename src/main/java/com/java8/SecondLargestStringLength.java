package com.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestStringLength {
    public static void main(String[] args) {
        String str = "I am learning streams API in Java";
        //Approach 1:
        String result = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println("Second Largest String:" + result + " " + "has length of:" + result.length());
        //Approach 2:
        int res = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(res);

    }
}
