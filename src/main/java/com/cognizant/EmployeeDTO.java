package com.cognizant;

import java.util.Arrays;
import java.util.List;

public class EmployeeDTO {

    public static void main(String[] args) {

        // Departments
        Department it = new Department("D01", "IT");
        Department hr = new Department("D02", "HR");
        Department finance = new Department("D03", "Finance");

        // Projects
        Project banking = new Project("P01", "Banking Application");
        Project ecommerce = new Project("P02", "E-Commerce");
        Project insurance = new Project("P03", "Insurance Portal");
        Project payroll = new Project("P04", "Payroll System");
        Project mobile = new Project("P05", "Mobile Application");

        // Employees
        Employee e1 = new Employee();
        e1.name = "Rohit";
        e1.address = "Kolkata";
        e1.department = it;
        e1.projList = Arrays.asList(banking, insurance);

        Employee e2 = new Employee();
        e2.name = "Amit";
        e2.address = "Delhi";
        e2.department = it;
        e2.projList = Arrays.asList(ecommerce, mobile);

        Employee e3 = new Employee();
        e3.name = "Priya";
        e3.address = "Mumbai";
        e3.department = hr;
        e3.projList = Arrays.asList(payroll);

        Employee e4 = new Employee();
        e4.name = "Rahul";
        e4.address = "Bangalore";
        e4.department = finance;
        e4.projList = Arrays.asList(banking, ecommerce);

        Employee e5 = new Employee();
        e5.name = "Neha";
        e5.address = "Pune";
        e5.department = it;
        e5.projList = Arrays.asList(insurance, mobile);

        Employee e6 = new Employee();
        e6.name = "Vikas";
        e6.address = "Hyderabad";
        e6.department = hr;
        e6.projList = Arrays.asList(ecommerce, payroll);

        List<Employee> empList =
                Arrays.asList(e1, e2, e3, e4, e5, e6);
        List<String> names = empList.stream().filter(x -> x.projList.stream().anyMatch(y -> y.getProjectName().equals("E-Commerce")))
                .map(x -> x.name).toList();
        System.out.println(names);
    }
}