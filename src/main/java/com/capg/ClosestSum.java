package com.capg;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ClosestSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 11, 7, 9};
        int target = 4;
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        int closestSum = Integer.MAX_VALUE;
        int bestLeft = 0;
        int bestRight = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (abs(target - sum) < abs(closestSum - target)) {
                closestSum = sum;
                bestLeft = left;
                bestRight = right;
            }
            if (sum < target)
                left++;
            if (sum > target)
                right--;
        }
        System.out.println(arr[bestLeft]);
        System.out.println(arr[bestRight]);
    }
}
