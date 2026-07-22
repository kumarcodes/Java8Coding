package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeeDeptWise {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, Long> countMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countMap);
    }
}
