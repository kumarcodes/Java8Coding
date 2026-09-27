package com.capg;

import com.superthirty.Employee;
import com.superthirty.EmployeeDTO;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHavingSalaryGreaterAvg {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDTO.getEmployees();
        Double salaryAvg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(salaryAvg);
        List<Employee> aboveAvgList = employeeList.stream().filter(x -> x.getSalary() > salaryAvg).toList();
        System.out.println(aboveAvgList);


    }
}
