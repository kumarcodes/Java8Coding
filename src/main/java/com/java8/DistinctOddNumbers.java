package com.java8;

import java.util.Arrays;
import java.util.List;

public class DistinctOddNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 9);
        List<Integer> distinctOddList = integerList.stream().filter(x -> x % 2 != 0).distinct().toList();
        System.out.println(distinctOddList);


    }
}
