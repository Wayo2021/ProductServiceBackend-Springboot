package com.learning.productservices.java.Advance.Lambda.classUsed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUsed {
    public static void main(String[] args) {
        Customer john = new Customer(1,"John P.", 15,Sex.MALE);
        Customer sarah = new Customer(2,"Sarah M.", 200,Sex.FEMALE);
        Customer charles = new Customer(3,"Charles B.", 150,Sex.MALE);
        Customer mary = new Customer(4,"Mary T.", 1,Sex.FEMALE);

        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

        List<Customer> customersWithMoreThan100Points = customers
                .stream()
                .filter(c -> c.getAge() > 100)
                .collect(Collectors.toList());

        List<Customer> customersWithMoreThan100Points2 = customers
                .stream()
                .filter(Customer::hasOverHundredPoints)
                .collect(Collectors.toList());




    }

}
