package com.capg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeChecker {

    public static void main(String[] args) {

        String str = "level";

        System.out.println("Stream Solution: "
                + isPalindromeUsingStreams(str));

        System.out.println("Two Pointer Solution: "
                + isPalindromeUsingTwoPointer(str));
    }

    // Solution 1: Using Streams
    public static boolean isPalindromeUsingStreams(String str) {

        List<String> stringList = Arrays.stream(str.split(""))
                .collect(Collectors.toList());

        Collections.reverse(stringList);

        String reversed = stringList.stream()
                .collect(Collectors.joining());

        return reversed.equals(str);
    }

    // Solution 2: Using Two Pointer
    public static boolean isPalindromeUsingTwoPointer(String str) {

        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}