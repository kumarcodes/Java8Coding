package com.topfifty;

import java.util.List;
import java.util.stream.Collectors;

public class CountEmployees {
    public static void main(String[] args) {
        List<Employees> employees = EmployeesDTO.getEmployees();

        employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()))
                .entrySet().forEach(System.out::println);
    }
}
