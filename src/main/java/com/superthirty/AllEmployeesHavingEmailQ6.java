package com.superthirty;

import java.util.List;

public class AllEmployeesHavingEmailQ6 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        boolean isAllHaivngEmail = employees.stream().allMatch(x -> x.getEmail() != null);
        employees.stream().filter(x -> x.getEmail() == null).forEach(System.out::println);
        System.out.println(isAllHaivngEmail);
    }
}
