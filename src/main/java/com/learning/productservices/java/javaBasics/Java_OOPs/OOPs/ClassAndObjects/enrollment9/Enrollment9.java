package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class Enrollment9 {
    private int year;
    private int semester;

    Enrollment9(int year, int semester){
        this.year = year;
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Enrollment: => " + " Year: " + year + " Semester: " + semester + "\n";
    }
}
