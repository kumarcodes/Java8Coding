package com.superthirty;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPaidDeptWiseQ18 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                .forEach((dept, emp) -> {
                    System.out.println(dept);
                    emp.ifPresent(e -> System.out.println(e.getName() + " - " + e.getSalary()));
                });

    }
}
