package com.topfifty;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesBasedOnName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering"),
                new Employee(2, "Bob", "Sales"),
                new Employee(3, "Charlie", "Engineering"),   // same department as Alice
                new Employee(4, "David", "Sales"),           // same department as Bob
                new Employee(5, "Eve", "HR")
        );
        List<Employee> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).values().stream()
                .map(x -> x.get(0)).toList();
        System.out.println(result);
        Collection<Employee> resultList = employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, e -> e, (x, y) -> x))
                .values();
        System.out.println(resultList);
    }
}
