package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public abstract class Employee {
    private String name;
    private double rate;
    private int hour;

    Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calRate();

    public String toString() {
        return "Name: " + name;
    }
}

final class TempEmployee extends Employee {
    private double rate;
    private int hour;

    TempEmployee(String name, double rate, int hour) {
        super(name);
        this.rate = rate;
        this.hour = hour;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double calRate() {
        double result = 0;
        result = rate * (double) hour;
        return result;
    }

    public String toString() {
        return super.toString() + " Rate: " + rate + " Hour: " + hour + " = ";
    }
}

final class RegularEmployee extends Employee {
    private double rate;
    private int hour;
    private double month;

    RegularEmployee(String name, double rate, int hour, double month) {
        super(name);
        this.rate = rate;
        this.hour = hour;
        this.month = month;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double calRate() {
        double result = 0;
        result = (rate * (double) hour) * month;
        return result;
    }

    public String toString() {
        return super.toString() + " Rate: " + rate + " Hour: " + hour + " Month: " + month;
    }
}

class UseEmployee {
    public static void main(String[] args) {

        TempEmployee temp = new TempEmployee("Sumana", 300, 8);
        System.out.println(temp.toString());

        RegularEmployee regular = new RegularEmployee("Sunama", 1500, 8, 30);
        System.out.println(regular.toString());
    }
}
