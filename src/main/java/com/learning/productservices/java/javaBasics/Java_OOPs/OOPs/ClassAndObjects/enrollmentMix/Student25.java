package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class Student25 extends People25 {
    private String studentId;
    private Faculty25 faculty;
    private Teacher25 teacher;
    Student25(String id, String name, String addr, String std, Faculty25 fac, Teacher25 tea){
        super(id, name, addr);
        studentId = std;
        faculty = fac;
        teacher = tea;
    }
    public void setStudentID(String std) {
        studentId = std;
    }
    public String getStudent() {
        return studentId;
    }
    public void setFaculty(Faculty25 fac) {
        faculty = fac;
    }
    public Faculty25 getFaculty() {
        return faculty;
    }
    public void setTeacher(Teacher25 tea){
        teacher = tea;
    }
    public Teacher25 gTeacher() {
        return teacher;
    }
    public String toString() {
        return super.toString() + "Student: " + studentId + "Faculty: " + faculty + "Teacher: " + teacher+ "\n";
    }
    
}
