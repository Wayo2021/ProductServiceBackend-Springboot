package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects;

public class ClassStudent extends ClassPerson{
    private String studentId;

    ClassStudent(String fullName, int age, String studentId){
        super(fullName, age);
        this.studentId = studentId;
    }

    @Override
    public String getFullName(){
        return studentId + " " + fullName;
    }
    @Override
    public void setFullName(String newFullName){
        fullName = newFullName;
    }

    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String id){
        this.studentId = id;
    }

    public String toString(){
        return "Person [Student [fullname = " + fullName + ", age = " + age + "], id = " + studentId + "]";
    }

}
