package com.java8;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Alice", Arrays.asList("Red", "Yellow"), 33),
                new Person("Tom", Arrays.asList("Blue", "Orange", "Red"), 22),
                new Person("Bob", Arrays.asList("Red", "Yellow", "Black"), 19));
        List<List<String>> colorList = personList.stream().map(Person::getColor).toList();
        System.out.println(colorList);
        List<String> colors = personList.stream().flatMap(x -> x.getColor().stream()).toList();
        System.out.println(colors);
    }
}
