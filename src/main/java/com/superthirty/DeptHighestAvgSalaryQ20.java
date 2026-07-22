package com.superthirty;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptHighestAvgSalaryQ20 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, Double> map = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        map.entrySet().stream().max(Map.Entry.comparingByValue())
                .ifPresent(x -> System.out.println(x.getKey() + " -> " + x.getValue()));

    }
}
