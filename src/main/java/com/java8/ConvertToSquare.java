package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToSquare {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> resultList = integerList.stream().map(x -> x * x).toList();
    }
}
