package com.learning.productservices.java.Basics.Enum;

public enum Color {
    RED("RED_red"),
    GREEN("GREEN_green"),
    BLUE("BLUE_blue");

    private final String value;

    Color(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public static void main(String[] args) {
        String color = Color.BLUE.getValue();
        System.out.println(color);
    }
}
