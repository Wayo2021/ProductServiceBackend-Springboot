package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class Faculty25 {
    private String facultyId;
    private String facultyName;
    private String facultyAddr;
    private String university;

    Faculty25(String facID, String facName, String facaddr, String uni){
        facultyId = facID;
        facultyName = facName;
        facultyAddr = facaddr;
        university = uni;
    }
    public void setFacultyID(String id) {
        facultyId = id;
    }
    public String getFacultyID() {
        return facultyId;
    }
    public void setFacultyName(String name) {
        facultyName = name;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyAddr(String addr) {
        facultyAddr = addr;
    }
    public String getFacultyAddr(){
        return facultyAddr;
    }
    public void setUniversity(String uni){
        university = uni;
    }
    public String getUniversity(){
        return university;
    }
    public String toString() {
        return "ID: " + facultyId + "Name: " + facultyName + "Address: " + facultyAddr + "University: " + university+ "\n";
    }
}
