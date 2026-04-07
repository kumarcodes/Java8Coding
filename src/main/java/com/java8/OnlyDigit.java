package com.java8;

import java.util.Arrays;
import java.util.List;

public class OnlyDigit {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc1", "47", "msnrpnnnnn2", "56");
        List<String> resultList = stringList.stream().filter(x -> x.matches("[0-9]+")).toList();
        System.out.println(resultList);

    }
}
