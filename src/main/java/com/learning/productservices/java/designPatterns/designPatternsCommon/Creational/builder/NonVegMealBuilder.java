package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.builder;

public class NonVegMealBuilder extends MealBuilder{
    private Meal meal;
    public NonVegMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void addBriyani() {
        this.meal.setBriyani("Chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Sprite");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
