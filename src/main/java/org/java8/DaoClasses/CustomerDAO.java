package org.java8.DaoClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {

    public static List<Customer> getAll(){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Saurabh", "abc@gmail.com", Arrays.asList("11","22")));
        list.add(new Customer(2,"Rahuk", "def@gmail.com", Arrays.asList("33","44")));
        list.add(new Customer(3,"Shivi", "ghi@gmail.com", Arrays.asList("55","66")));
        list.add(new Customer(4,"Chichi", "yahoo@gmail.com", Arrays.asList("77","88")));
        return list;
    }
}
