package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of integers,
find out all the numbers starting with 1 using Stream functions
*/
public class StartsWith {
    public static void main(String[] args) {
        int[] arr = {2, 1, 99, 11, 17, 21, 20, 7};
        int[] res = findStartingWith(arr);
        for (int num : res)
            System.out.print(num + " ");
    }

    private static int[] findStartingWith(int[] arr) {


        return Arrays.stream(arr)
                .filter(x -> String.valueOf(x).startsWith("1")).toArray();


    }
}
