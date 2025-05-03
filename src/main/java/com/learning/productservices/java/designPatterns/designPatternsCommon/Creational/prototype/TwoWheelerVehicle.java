package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.prototype;

public class TwoWheelerVehicle extends Vehicle{
    private boolean isElectric;

    public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }
}
