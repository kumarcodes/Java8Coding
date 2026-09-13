package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptWiseSalary {
    public static void main(String[] args) {
        List<Employees> employees = List.of(
                new Employees(1, "Aarav", "Engineering", 85000),
                new Employees(2, "Diya", "Engineering", 95000),
                new Employees(3, "Kabir", "Engineering", 78000),
                new Employees(4, "Meera", "Sales", 60000),
                new Employees(5, "Rohan", "Sales", 65000),
                new Employees(6, "Sanya", "HR", 50000),
                new Employees(7, "Ishaan", "HR", 99000),
                new Employees(8, "Tara", "HR", 52000)
        );
        Map<String, Double> countMap = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment, (
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary)),
                        x -> x.map(Employees::getSalary).orElse(null)))));
        System.out.println(countMap);

    }
}
