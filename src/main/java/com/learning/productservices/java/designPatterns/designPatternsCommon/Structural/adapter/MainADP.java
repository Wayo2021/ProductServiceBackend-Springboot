package com.learning.productservices.java.designPatterns.designPatternsCommon.Structural.adapter;

public class MainADP {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
    }
}
