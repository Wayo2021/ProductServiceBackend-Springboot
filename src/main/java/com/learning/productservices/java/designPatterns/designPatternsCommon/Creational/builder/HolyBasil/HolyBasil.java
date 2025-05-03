package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.builder.HolyBasil;

public class HolyBasil {
    private final String meat;
    private final String fishSauce;
    private final String garlic;
    private final String chili;

    HolyBasil(HolyBasilBuilder builder) {
        this.meat = builder.meat;
        this.fishSauce = builder.fishSauce;
        this.garlic = builder.garlic;
        this.chili = builder.chili;
    }

    public String getMeat() {
        return meat;
    }

    public String getFishSauce() {
        return fishSauce;
    }

    public String getGarlic() {
        return garlic;
    }

    public String getChili() {
        return chili;
    }

    @Override
    public String toString() {
        String order = "HolyBasil" + this.meat + ", fishSauce:" + this.fishSauce + ", garlic:" + this.garlic + ", chili:" + this.chili;
        return order;
    }
}
