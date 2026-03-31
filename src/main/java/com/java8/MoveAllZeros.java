package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class MoveAllZeros {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 0, 7, 6, 0, 9, 8);
        //Approach 1
        List<Integer> zeroList = integerList.stream().filter(x -> x == 0).toList();
        List<Integer> nonZeroList = integerList.stream().filter(x -> x != 0).toList();
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(zeroList);
        resultList.addAll(nonZeroList);
        System.out.println(resultList);

        //Approach 2
        Map<Boolean, List<Integer>> resultMap = integerList.stream()
                .collect(Collectors.partitioningBy(x -> x != 0));
        Collection<List<Integer>> collectionView = resultMap.values();
        List<Integer> resultInList = collectionView.stream().flatMap(x -> x.stream()).toList();
        System.out.println(resultInList);
    }
}
