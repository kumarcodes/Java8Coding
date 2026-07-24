package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNameFrequencyQ29 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, Long> map = employees.stream().map(Employee::getName)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }
}
