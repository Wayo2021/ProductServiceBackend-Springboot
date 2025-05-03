package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class Teacher25 extends People25 {
    private String teacherId;
    private Faculty25 faculty;

    Teacher25(String id, String name, String addr, String tea, Faculty25 fac){
        super(id, name, addr);
        teacherId = tea;
        faculty = fac;
    }
    public void setTeacher(String tea) {
        teacherId = tea;
    }
    public String getTeacher() {
        return teacherId;
    }
    public void setFaculty(Faculty25 fac) {
        faculty = fac;
    }
    public Faculty25 getFaculty25() {
        return  faculty;
    }
    public String toString(){
        return super.toString() + "Teacher: " + teacherId + "Faculty: " + faculty+ "\n";
    }
}
