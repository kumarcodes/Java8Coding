package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates computing the symmetric difference between two lists.
 */
public class UniqueElementsTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9);

        // Compute elements that are present in exactly one of the lists (symmetric difference)
        List<Integer> resultList = symmetricDifference(list1, list2);

        System.out.println(resultList);
    }

    /**
     * Returns a new list containing elements that are unique across the two provided lists.
     * That is, elements that appear in either listA or listB but not in both.
     *
     * Implementation notes:
     * - Creates defensive copies before mutating (removeAll) to avoid modifying inputs.
     * - Preserves ordering: elements from listB (excluding those in listA) are added first,
     *   followed by elements from listA (excluding those in listB). Change ordering as needed.
     */
    public static List<Integer> symmetricDifference(List<Integer> listA, List<Integer> listB) {
        // Make mutable copies so removeAll can be used safely
        List<Integer> aOnly = new ArrayList<>(listA);
        aOnly.removeAll(listB); // leaves elements unique to listA

        List<Integer> bOnly = new ArrayList<>(listB);
        bOnly.removeAll(listA); // leaves elements unique to listB

        // Combine results into a single list. Order: bOnly then aOnly (matches previous behavior)
        List<Integer> result = new ArrayList<>();
        result.addAll(bOnly);
        result.addAll(aOnly);
        return result;
    }
}
