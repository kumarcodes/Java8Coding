package com.persistent;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 10, 9, 4, 5};
        int target = 7;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            if (map.containsKey(difference)) {
                System.out.println("Numbers are: " + difference + " and " + arr[i]);
                System.out.println("Indexes are: " + map.get(difference) + " and " + i);
            }
            map.put(arr[i], i);
        }
    }
}
