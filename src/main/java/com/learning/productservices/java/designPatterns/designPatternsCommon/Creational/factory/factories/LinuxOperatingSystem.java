package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factories;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture){
        super(version, architecture);
    }
    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
