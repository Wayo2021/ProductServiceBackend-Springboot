package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class People25 {
    private String id;
    private String name;
    private String address;

    People25(String id, String name, String addr){
        this.id = id;
        this.name = name;
        this.address = addr;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getID(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String addr){
        this.address = addr;
    }
    public String toString(){
        return "ID: " + id + "Name: " + name + "Address: " + address+ "\n";
    }
}
