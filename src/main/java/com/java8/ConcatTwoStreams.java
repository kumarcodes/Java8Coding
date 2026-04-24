package com.java8;

import java.util.stream.Stream;

public class ConcatTwoStreams {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Java", "Python");
        Stream<String> stream2 = Stream.of("C", ".NET");
        Stream<String> concatStream = Stream.concat(stream1, stream2);
        concatStream.forEach(System.out::println);

    }
}
