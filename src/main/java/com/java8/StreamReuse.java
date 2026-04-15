package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReuse {
    //We can't resue stream.
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("alice", "neena", "meena", "rohan", "neema");
        Stream<String> stringStream = nameList.stream();
        //Consumption 1
        stringStream.forEach(System.out::println);
        //Consumption 2 will throw IllegalStateException stating stream has already been operated upon or closed
        // long length = stringStream.count();

    }
}
