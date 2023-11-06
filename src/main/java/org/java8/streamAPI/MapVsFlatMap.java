package org.java8.streamAPI;

import org.java8.DaoClasses.Customer;
import org.java8.DaoClasses.CustomerDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> list = CustomerDAO.getAll();

        // Map function helps in transforming data for a single element: converts list of customers to a list of strings
        // By single element we mean 1:1 mapping (customer -> customer.getEmail()), one customer will have only a single email
        //It processes stream of values
        List<String> emailList = list.stream().
                map(customer -> customer.getEmail()).
                collect(Collectors.toList());
        System.out.println(list);

        List<List<String>> phoneNumbers = list.stream().
                map(customer -> customer.getPhoneNumbers()).
                collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //FlatMap also transforms the data but for multiple elements, also it flattens the list of objects
        // It gives one to many mapping : customer -> customer.getPhoneNumbers()
        //It processes stream of stream of values
        List<String> phones =list.stream().
                flatMap(customer -> customer.getPhoneNumbers().stream()).
                collect(Collectors.toList());
        System.out.println(phones);

    }
}
