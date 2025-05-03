package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class Student9 extends People9{
    private String studentId;

    Student9(String id, String name, String addr, String stdId){
        super(id,name,addr);
        studentId = stdId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + " Student ID: " + studentId + "\n";
    }
}
