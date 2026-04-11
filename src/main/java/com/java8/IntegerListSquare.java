package com.java8;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
//Write a program to convert a list of integer to its corresponding squares
public class IntegerListSquare {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> resultList = integerList.stream().map(x -> x * x).toList();
        System.out.println(resultList);
    }
}
