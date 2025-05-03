package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class Subject9 {

    private String subjectId;
    private String subjectName;
    private int unit;
    private double gpa;

    Subject9(String subId, String subName, int unit, double gpa){
        subjectId = subId;
        subjectName = subName;
        this.unit = unit;
        this.gpa = gpa;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Subject: => " + " Subject ID " + subjectId + " Subject Name: " + subjectName + " Unit: " + unit + " GPA: " + gpa + "\n";
    }
}
