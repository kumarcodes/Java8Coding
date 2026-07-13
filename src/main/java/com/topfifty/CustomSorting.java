package com.topfifty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering"),
                new Employee(2, "Bob", "Sales"),
                new Employee(3, "Charlie", "Engineering"),   // same department as Alice
                new Employee(4, "David", "Sales"),           // same department as Bob
                new Employee(5, "Eve", "HR")
        );
        List<String> emp = employees.stream().sorted(Comparator.comparing(Employee::getDepartment)
                .thenComparing(Employee::getName)).map(x -> x.getName() + " -> " + x.getDepartment()).collect(Collectors.toList());
        System.out.println(emp);
    }
}
