package com.superthirty;

import java.util.List;
import java.util.stream.Collectors;

public class JoinEmployeeNameQ24 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        String str = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
