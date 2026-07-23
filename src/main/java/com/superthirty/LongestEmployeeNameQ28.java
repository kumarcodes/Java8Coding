package com.superthirty;

import java.util.Comparator;
import java.util.List;

public class LongestEmployeeNameQ28 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().map(Employee::getName).max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

    }
}
