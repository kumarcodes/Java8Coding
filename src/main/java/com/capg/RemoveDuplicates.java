package com.capg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 5);
        //Approach 1 not effective
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = list.stream().filter(x -> set.add(x)).collect(Collectors.toSet());
        System.out.println(resultSet);
        //Approach 2
        List<Integer> results = list.stream().distinct().toList();
        System.out.println(results);
        //Approach 3
        Set<Integer> answerSet = list.stream().collect(Collectors.toSet());
        System.out.println(answerSet);
    }
}
