package com.topfifty;

import java.util.*;

public class SecondHighestInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 3, 4, 5, 8, 7, 6);
        Integer result = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(result);

    }
}
