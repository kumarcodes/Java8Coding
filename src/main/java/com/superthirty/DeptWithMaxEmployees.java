package com.superthirty;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptWithMaxEmployees {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }
}
