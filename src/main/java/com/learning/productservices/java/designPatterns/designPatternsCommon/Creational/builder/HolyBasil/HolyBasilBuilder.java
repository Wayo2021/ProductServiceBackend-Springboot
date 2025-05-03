package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.builder.HolyBasil;

//Builder ที่ทำหน้าที่เป็น setter
public class HolyBasilBuilder {
    final String meat;
    String fishSauce;
    String garlic;
    String chili;

    public HolyBasilBuilder(String meat) {
        this.meat = meat;
    }

    public HolyBasilBuilder fishSauce(String fishSauce) {
        this.fishSauce = fishSauce;
        return this;
    }

    public HolyBasilBuilder garlic(String garlic) {
        this.garlic = garlic;
        return this;
    }

    public HolyBasilBuilder chili(String chili) {
        this.chili = chili;
        return this;
    }

    public HolyBasil build() {
        HolyBasil holyBasil = new HolyBasil(this);
        return holyBasil;
    }
}
