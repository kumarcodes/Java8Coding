package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConverter {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<Integer, String> map = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(map);
    }
}
