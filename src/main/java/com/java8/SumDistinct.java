package java8;

import java.util.Arrays;

public class SumDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 1, 1, 8, 8, 7};

        Integer sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);
    }
}
