package com.java8;

// Provides Stream API utilities used to generate Fibonacci pairs.
import java.util.stream.Stream;

// Demonstrates generating Fibonacci numbers using Java 8 Stream.iterate.
public class FiboNumbers {
    // Entry point of the program.
    public static void main(String[] args) {
        // Start with the first Fibonacci pair: (0, 1).
        Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]})
                // Generate only the first 10 Fibonacci values.
                .limit(10)
                // From each pair, take the first value as the current Fibonacci number.
                .map(x -> x[0])
                // Print each Fibonacci number.
                .forEach(System.out::println);
    }
}
