package com.capg;

import com.superthirty.Employee;
import com.superthirty.EmployeeDTO;

import java.util.List;
import java.util.stream.Collectors;

public class GroupEmployeesByDept {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDTO.getEmployees();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((x, y) ->
                        System.out.println(x + "->" + y.stream().map(Employee::getName).toList()));
    }
}
