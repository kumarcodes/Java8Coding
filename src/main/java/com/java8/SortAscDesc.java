package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscDesc {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};
        //DESC Order
        System.out.println("Number In sorted Descending Order");
        List<Integer> arrList = Arrays.stream(arr).mapToObj(x -> x).sorted(Comparator.reverseOrder()).collect(Collectors.toUnmodifiableList());
        //ASC Order
        System.out.println(arrList);
        System.out.println("Number In sorted Ascending Order");
        Arrays.stream(arr).mapToObj(x -> x).sorted().forEach(System.out::print);
    }
}
