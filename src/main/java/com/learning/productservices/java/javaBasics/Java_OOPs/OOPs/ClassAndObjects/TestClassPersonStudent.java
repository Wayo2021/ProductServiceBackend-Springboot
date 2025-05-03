package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects;

public class TestClassPersonStudent {
    public static void main(String[] args) {

//        --------------------------------------------------------------------------
//        Class and Object

//        Class
//        ClassPerson john = new ClassPerson();

//        Object
//        john.fullName = "John Smith";
//        john.age = 50;

//        System.out.println(john.fullName + " " + john.age + " years");

//        --------------------------------------------------------------------------
//        call Method in Class Person

//        ClassPerson john = new ClassPerson();
//        john.fullName = "John Smith";
//        john.setAge(120);
//        john.setAge(20);
//
//        int year = john.calculateBirthYear();
//        System.out.println(john.fullName + " born year " + year);
//        --------------------------------------------------------------------------
//        Getter and Setter

//        ClassPerson john = new ClassPerson();
//        john.setFullName("John Smith");
//        john.setAge(50);
//
//        ClassPerson robert = new ClassPerson();
//        robert.setFullName("Robert Morgan");
//        robert.setAge(25);
//
//        System.out.println(john.getFullName() + " " + john.getAge() + " years old");
//        System.out.println(robert.getFullName() + " " + robert.getAge() + " years old");

//        --------------------------------------------------------------------------
//        Constructor

//        ClassPerson john = new ClassPerson("John Smith", 50);
//        ClassPerson robert = new ClassPerson("Robert Morgan", 25);
//
//        System.out.println("#Constructor");
//        System.out.println(john.getFullName() + " " + john.getAge() + " years old");
//        System.out.println(robert.getFullName() + " " + robert.getAge() + " years old");

//        --------------------------------------------------------------------------
//        Inheritance
//        ClassStudent pop = new ClassStudent();
//        pop.setFullName("Poppy");
//        pop.setAge(21);
//        pop.setStudentId("624020202-2");
//
//        System.out.println("Inheritance");
//        System.out.println(pop.getStudentId());
//        System.out.println(pop.getFullName());
//        System.out.println(pop.getAge() + " years old.");

//        --------------------------------------------------------------------------
//        Super

//        ClassStudent pop = new ClassStudent("Poppy",21,"624020202-2");
//        System.out.println("Super");
//        System.out.println(pop);

//        --------------------------------------------------------------------------
//        Overloading

//        ClassPerson john = new ClassPerson("John", 20);
//
//        System.out.println("Overloading");
//        int year = john.calculateBirthYear();
//        System.out.println("Any year " + year);
//        year = john.calculateBirthYear(2566, 25);
//        System.out.println("Current year " + year);

//        --------------------------------------------------------------------------
//        Static attribute

//        System.out.println("Static Attribute");
//        System.out.println(ClassVisitor.count);
//        int visitor = ClassVisitor.count = 1;
//        System.out.println(visitor);

//        --------------------------------------------------------------------------
//        Static Method

//        System.out.println("Result " +  ClassCalculator.plus(10,10));

//        --------------------------------------------------------------------------
//        Overloading Static Method

//        System.out.println("Result version A = " + OverloadingStaticMethod.average(1,2));
//        System.out.println("Result version B = " + OverloadingStaticMethod.average(1.0,2.0));
//        System.out.println("Result version C = " + OverloadingStaticMethod.average(1,2,3));
//        System.out.println("Result version B = " + OverloadingStaticMethod.average(1.0,2));
//        --------------------------------------------------------------------------
//        Overloading Constructor

//        ClassPerson john = new ClassPerson("John Smith");
//        ClassPerson robert = new ClassPerson("Robert Morgan", 25);
//
//        System.out.println(john);
//        System.out.println(robert);
//        --------------------------------------------------------------------------
//        Override getter and setter

//        ClassStudent john = new ClassStudent("John Smith",25,"62521566");
//        john.setFullName("John Siri");
//        System.out.println(john.getFullName());
    }
}
