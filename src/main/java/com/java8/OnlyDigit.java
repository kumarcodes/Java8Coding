package com.java8;

import java.util.Arrays;
import java.util.List;

public class OnlyDigit {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("as1", "bs2", "56", "47");
        List<String> resultList = stringList.stream().filter(x -> x.matches("[0-9]+")).toList();
        System.out.println(resultList);
    }
}
