package com.superthirty;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        //First Approach Using sorted and findFirst
        String result = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName).toList().stream().findFirst().orElse(null);
        System.out.println(result);
        //Second Approach Using max

        Optional<Employee> resultUsinngMax = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(resultUsinngMax);
    }
}
