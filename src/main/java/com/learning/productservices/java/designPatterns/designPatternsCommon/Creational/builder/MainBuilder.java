package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();

        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
    }
}
