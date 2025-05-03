package com.learning.productservices.java.javaBasics.Java_OOPs.Classes_AND_Objects;

public class Classes {
     public static class Car {
        //fields
         String type;
         String model;
         String color;
         int speed;

         //constructor
         Car(String type, String model, String color) {
             this.type = type;
             this.model = model;
             this.color = color;
         }


         //methods
         int increaseSpeed(int increase) {
             this.speed = this.speed + increase;
             return this.speed;
         }
    }
}
