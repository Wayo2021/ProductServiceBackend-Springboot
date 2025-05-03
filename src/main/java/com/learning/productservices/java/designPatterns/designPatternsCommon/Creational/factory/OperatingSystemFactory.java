package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factories.LinuxOperatingSystem;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factories.OperatingSystem;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factories.WindowsOperatingSystem;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}
