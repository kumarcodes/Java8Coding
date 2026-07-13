package com.topfifty;

import java.util.*;
import java.util.stream.Collectors;

public class MaxMinAvgOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        printStatistics(list);
        anotherApproach(list);
    }

    private static void printStatistics(List<Integer> list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        OptionalDouble avg = list.stream().mapToDouble(x -> x).average();
        System.out.println(sum);
        System.out.println("Max is: " + max.getAsInt());
        System.out.println("Min is: " + min.getAsInt());
        System.out.println("Average is: " + avg.getAsDouble());
    }

    private static void anotherApproach(List<Integer> list) {
        IntSummaryStatistics stats = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats);
        System.out.println("Sum is: " + stats.getSum());
        System.out.println("Average is: " + stats.getAverage());
        System.out.println("Max is: " + stats.getMax());
        System.out.println("Min is: " + stats.getMin());
        System.out.println("Count is: " + stats.getCount());
    }
}
