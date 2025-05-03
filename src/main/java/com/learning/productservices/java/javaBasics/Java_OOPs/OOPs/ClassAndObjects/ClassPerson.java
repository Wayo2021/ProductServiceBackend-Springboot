package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects;

public class ClassPerson {
    protected String fullName;
    protected int age;

    ClassPerson(String newFullName){
        this.fullName = newFullName;
    }
    ClassPerson(String newFullName, int newAge){
        this.fullName = newFullName;
        this.age = newAge;
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String newFullName){
        fullName = newFullName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

//    void setAge(int newAge){
//        if(newAge >= 1 && newAge <= 120){
//            age = newAge;
//        }else{
//            System.err.println("Error!! Age between be 1 to 120");
//        }
//    }



    int calculateBirthYear(){
        int yearOld = 2565 - age;
        return yearOld;
    }
    //    Overloading
    int calculateBirthYear(int currentYear, int age){
        int yearOld = currentYear - age;
        return yearOld;
    }
}
