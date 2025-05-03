package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class People9 {
    private String id;
    private String name;
    private String address;

    People9(String id, String name, String addr){
        this.id = id;
        this.name = name;
        address = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "People => " + " ID: " + id + " Name: " + name + " Address: " + address + "\n";
    }
}
