package com.topfifty;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9, 10));
        List<Integer> flattenList = list.stream().flatMap(Collection::stream).toList();
        System.out.println(flattenList);
    }
}
