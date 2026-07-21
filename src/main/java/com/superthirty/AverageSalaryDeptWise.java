package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryDeptWise {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, Double> resultMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(resultMap);
    }
}
