package com.java8;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    // Question: Check whether two strings are anagrams of each other using Java 8 features.

    public static void main(String[] args) {
        //Fixed github profile issue.
        String first = "listen";
        String second = "silent";
        System.out.println("Choose approach: 1 = String sort, 2 = StringBuilder chars sort");
        // TODO: Write your Java 8 solution here.
        Scanner sc = new Scanner(System.in);


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                isAnagramUsingString(first, second);
                break;
            case 2:
                isAnagramUsingStringBuilder(first, second);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    //Approach 1: Easy to understand but less efficient than approach 2

    public static void isAnagramUsingString(String first, String second) {

        String str1 = first.replaceAll("\\s", "").toLowerCase();
        String str2 = second.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            printAnagramResult(false);
            return;
        }
        String sorted1 = Arrays.stream(str1.split("")).sorted().reduce("", String::concat);
        String sorted2 = Arrays.stream(str2.split("")).sorted().reduce("", String::concat);
        printAnagramResult(sorted1.equals(sorted2));
    }

    public static void isAnagramUsingStringBuilder(String first, String second) {
        //Approach 2: Difficult to understand but more efficient than approach 1
        String normalizedFirst = first.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        String normalizedSecond = second.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        printAnagramResult(normalizedFirst.equals(normalizedSecond));
    }

    private static void printAnagramResult(boolean isAnagram) {
        System.out.println(isAnagram ? "The strings are anagrams." : "The strings are not anagrams.");
    }
}
