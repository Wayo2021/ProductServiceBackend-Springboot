package com.learning.productservices.java.Advance.Lambda.classUsed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private int age;
    private Sex gender;

    Customer(int id, String name, int age, Sex gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean hasOverHundredPoints() {
        return this.age > 100;
    }

}
