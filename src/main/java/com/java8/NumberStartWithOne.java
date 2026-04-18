package com.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartWithOne {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 11, 17, 19);
        List<String> startWitOneList = numberList.
                stream().map(x -> x + ""). //Convert a List to Integer.
                        filter(x -> x.startsWith("1")).toList();
        System.out.println(startWitOneList);
    }
}
