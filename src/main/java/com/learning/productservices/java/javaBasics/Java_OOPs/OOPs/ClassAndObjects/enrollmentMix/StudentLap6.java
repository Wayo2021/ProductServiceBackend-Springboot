package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class StudentLap6 {
    private String id;
    private String name;
    private double gpa;
    private final double MIN_GPA = 2.00;

    StudentLap6(String id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public String toString() {
        return "ID: " + id + "Name: " + name + "GPA: " + gpa;
    }

}

class FullTimeStudent extends StudentLap6{
    FullTimeStudent(String id, String name, double gpa){
        super(id, name, gpa);
    }
    public String toString() {
        return super.toString();
    }
}

class PartTimeStudent extends StudentLap6{
    PartTimeStudent(String id, String name, double gpa){
        super(id, name, gpa);
    }
    public String toString() {
        return super.toString();
    }
}

class GradStudent extends StudentLap6{
    private String thesisTitle;
    private String supervisor;

    GradStudent(String id, String name, double gpa, String title, String sup){
        super(id,name,gpa);
    }
    public void setThesisTitle(String title) {
        thesisTitle = title;
    }
    public void setSupervisor(String sup){
        supervisor = sup;
    }
    public String toString(){
        return super.toString() + "Thesis Title: " + thesisTitle + "Supervisor: " + supervisor;
    }

}

class PhStudent extends GradStudent{
    private boolean passQualify;

    PhStudent(String id, String name, double gpa, String title, String sup){
        super(id,name,gpa,title,sup);
    }
    public void isPassQualify(boolean pass){
        passQualify = pass;
    }
    public String toString(){
        return super.toString() + "Pass: " + passQualify;
    }
}

class UseStudentLap6{
    public static void main(String[] args) {
        
        FullTimeStudent obj1 = new FullTimeStudent("1234", "nana", 3.00);
        System.out.println(obj1.toString());

        PartTimeStudent obj2 = new PartTimeStudent("123", "nama", 3.00);
        System.out.println(obj2.toString());

        PhStudent obj3 = new PhStudent("12", "Sawinee", 3.00, "DM", "Kritsana");
        obj3.isPassQualify(true);
        System.out.println(obj3.toString());
    }
}