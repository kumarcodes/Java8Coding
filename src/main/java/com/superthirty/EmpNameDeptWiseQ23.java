package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpNameDeptWiseQ23 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, List<String>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(map);
    }
}
