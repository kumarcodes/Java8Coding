package com.java8;
import java.util.*;
import java.util.stream.Collectors;



public class EmployeeStreamRunner {
    public static void main(String[] args) {

        List<EmployeeWithStatus> employeeWithStatusList = Arrays.asList(
                new EmployeeWithStatus(1, "Amit Sharma", "IT", 95000.0, "ACTIVE"),
                new EmployeeWithStatus(2, "Priya Patel", "IT", 120000.0, "ACTIVE"),
                new EmployeeWithStatus(3, "Raj Kumar", "IT", 135000.0, "INACTIVE"), // Highest salary but INACTIVE (should be skipped)

                new EmployeeWithStatus(4, "Sneha Reddy", "HR", 85000.0, "ACTIVE"),
                new EmployeeWithStatus(5, "Vikram Singh", "HR", 95000.0, "ACTIVE"), // Highest ACTIVE in HR

                new EmployeeWithStatus(6, "Rohan Das", "Finance", 110000.0, "ACTIVE"), // Only ACTIVE in Finance
                new EmployeeWithStatus(7, "Neha Gupta", "Finance", 125000.0, "INACTIVE")
        );

      Map<String, Double> empresult =  employeeWithStatusList.stream().filter(x->x.getStatus().equals("ACTIVE"))
              .collect(Collectors.toMap(EmployeeWithStatus::getName, EmployeeWithStatus::getSalary));
        System.out.println(empresult);

    }
}
