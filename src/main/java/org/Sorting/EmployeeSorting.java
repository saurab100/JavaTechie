package org.Sorting;

import java.util.*;

public class EmployeeSorting {

    //How to sort an Employee class on the basis of salary
    public static void main(String[] args) {
        /*Employee employee1 = new Employee(1, "Saurabh", 2000.0);
        Employee employee2 = new Employee(5, "Shruti", 1000.0);
        Employee employee3 = new Employee(4, "Rajesh", 50000.0);
        Employee employee4 = new Employee(2, "Deepika", 500.0);*/

        List<Employee> list = Arrays.asList(new Employee(1, "Saurabh", 2000.0),
                new Employee(5, "Shruti", 1000.0),
                new Employee(4, "Rajesh", 50000.0),
                new Employee(2, "Deepika", 500.0));
        Collections.sort(list, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        for (Employee e : list) {
            System.out.println(e);
        }

    }
}
