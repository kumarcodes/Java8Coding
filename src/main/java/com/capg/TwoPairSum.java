package com.capg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoPairSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 7, 3, 5, 9);
        int target = 11;
        Set<Integer> set = new HashSet<>();
        for (int i : list) {
            int compliment = target - i;
            if (list.contains(compliment)){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
