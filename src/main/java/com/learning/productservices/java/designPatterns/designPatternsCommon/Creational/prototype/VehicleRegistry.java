package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String , Vehicle> vehicleMap = new HashMap<>();

    static {
        vehicleMap.put("TWO", new TwoWheelerVehicle("120", "royal", 100000, false));
        vehicleMap.put("FOUR", new FourWheelerVehicle("120", "bmw", 100000, false, false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return vehicleMap.get(vehicle).clone();
    }
}
