package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class Subject25 {
    private String subjectId;
    private String subjectName;
    private int unit;
    private double gpa;
    private Teacher25 teacher;

    Subject25( String subId, String subName, int unit, Teacher25 tea){
        subjectId = subId;
        subjectName = subName;
        this.unit = unit;
        teacher = tea;
    }
    public void setSubjectID(String subID) {
        subjectId = subID;
    }
    public String getSubjectID() {
        return subjectId;
    }
    public void setSubjectName(String subName) {
        subjectName = subName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }
    public int getUnit() {
        return unit;
    }
    public void setGrade(double gpa){
        this.gpa = gpa;
    }
    public double getGrade(){
        return gpa;
    }
    public void setTeacher(Teacher25 tea) {
        teacher = tea;
    }
    public Teacher25 getTeacher25() {
        return teacher;
    }
    public String toString(){
        return "Subject ID: " + subjectId + "Subject Name" + subjectName + "Unit: " + unit + "Grade: " + gpa + "Teacher: " + teacher+ "\n";
    }
}
