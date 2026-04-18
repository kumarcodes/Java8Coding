package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32,
                15);
        Set<Integer> uniqueSet = new HashSet<>();
        myList.stream().filter(x->!uniqueSet.add(x)).forEach(System.out::println);

    }
}
