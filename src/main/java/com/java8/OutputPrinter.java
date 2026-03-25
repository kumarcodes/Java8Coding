package com.java8;

public final class OutputPrinter {

    private OutputPrinter() {
        // Utility class
    }

    public static void printPrompt(String question, Object sampleInput) {
        System.out.println("Question: " + question);
        System.out.println("Sample input: " + sampleInput);
    }
}

