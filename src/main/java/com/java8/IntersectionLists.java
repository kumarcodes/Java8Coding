package com.java8;

import java.util.Arrays;
import java.util.List;

public class IntersectionLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9, 10, 2);
        List<Integer> resultList = list1.stream().filter(list2::contains).toList();
        System.out.println(resultList);
    }
}
