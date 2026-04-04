package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UnionOfLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(0, 8, 9, 10, 11);
        List<Integer> unionList = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println(unionList);

    }
}
