package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class Faculty9 {
    private String facultyId;
    private String facultyName;
    private String facultyAddress;
    private String university;

    Faculty9(String facId, String facName, String facAddress, String unisers){
        facultyId = facId;
        facultyName = facName;
        facultyAddress = facAddress;
        university = unisers;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyAddress() {
        return facultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        this.facultyAddress = facultyAddress;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Faculty => " + " Faculty ID: " + facultyId + " Faculty Name: " + facultyName + " Faculty Address: " + facultyAddress + " University: " + university + "\n";
    }
}
