package com.topfifty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q12EmployeesMapping {
    public static void main(String[] args) {
        List<Employees> employees = EmployeesDTO.getEmployees();
        Map<Integer, String> map = employees.stream().collect(Collectors.toMap(Employees::getId, Employees::getName));
        System.out.println(map);
    }
}
