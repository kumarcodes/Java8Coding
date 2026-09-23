package com.capg;

import com.superthirty.Employee;
import com.superthirty.EmployeeDTO;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDTO.getEmployees();
       Employee ans =  employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst().orElse(null);
        System.out.println(ans);
    }
}
