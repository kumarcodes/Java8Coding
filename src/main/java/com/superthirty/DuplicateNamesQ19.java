package com.superthirty;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNamesQ19 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().map(Employee::getName).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}
