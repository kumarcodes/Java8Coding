package com.corejava;

public class PatternPrint {
    public static void main(String[] args) {
        int rows = 5;
        int col = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
