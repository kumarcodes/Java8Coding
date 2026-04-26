package com.java8;

import java.util.Arrays;
import java.util.List;

public class AgeGreaterThanThirty {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Alice", Arrays.asList("Red", "Yellow"), 49),
                new Person("Tom", Arrays.asList("Blue", "Orange", "Red"), 22),
                new Person("Rohit", Arrays.asList("Blue", "Orange", "Red"), 21),
                new Person("Bob", Arrays.asList("Red", "Yellow", "Black"), 19));
        List<String> names = personList.stream().filter(x -> x.getAge() > 20).map(Person::getName).toList();
        names.stream().distinct().sorted().forEach(System.out::println);
    }
}
