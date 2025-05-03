package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollment9;

public class Teacher9 extends People9{
    private String teachId;

    Teacher9(String id, String name, String addr, String teachId){
        super(id,name,addr);
        this.teachId = teachId;
    }

    public String getTeachId() {
        return teachId;
    }

    public void setTeachId(String teachId) {
        this.teachId = teachId;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher ID: " + teachId + "\n";
    }
}
