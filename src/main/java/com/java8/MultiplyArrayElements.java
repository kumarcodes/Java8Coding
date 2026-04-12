package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyArrayElements {
    public static void main(String[] args) {
        //Approach 1 if Array is of primitive type
        int[] arr = {1, 2, 3, 4, 5};
        Optional<Integer> result = Arrays.stream(arr).boxed().toList() //converted array into list
                .stream().reduce((a, b) -> a * b);
        result.ifPresent(System.out::println);
        //Approach 2 if Array is of non Primitive Type
        Integer[] arr1 = {1, 2, 3, 4, 5};
        List<Integer> integersList = Arrays.asList(arr1);
        Optional<Integer> resultNonPrimitiveArray = integersList.stream()
                .reduce((a, b) -> a * b);
        resultNonPrimitiveArray.ifPresent(System.out::println);

    }
}
