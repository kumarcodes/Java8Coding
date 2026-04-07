package com.java8;

import java.util.Arrays;
import java.util.List;

public class CalculateListAverage {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double avg = integerList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(avg);
    }
}
