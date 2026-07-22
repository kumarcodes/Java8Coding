package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeDeptWiseQ14 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().forEach(
                        entry ->
                        {
                            System.out.println(entry.getKey());
                            entry.getValue().forEach(x -> System.out.println(x.getName()));
                        }

                );
    }
}
