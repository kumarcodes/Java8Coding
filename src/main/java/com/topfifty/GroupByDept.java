package com.topfifty;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDept {
    public static void main(String[] args) {
        List<Employees> employees = EmployeesDTO.getEmployees();
        Map<String, Optional<Employees>> map = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))
        ));
        System.out.println(map);
    }
}
