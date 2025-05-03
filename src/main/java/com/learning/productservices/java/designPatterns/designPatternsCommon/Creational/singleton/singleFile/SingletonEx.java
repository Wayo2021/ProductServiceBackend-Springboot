package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.singleton.singleFile;

//    Eager Initialization
class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return instance;
    }
}


//    Lazy Initialization
class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}


//    Thread safe Method Initialization
class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    synchronized public static SingletonSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedMethod();
        }

        return instance;
    }
}


//    Thread safe block Initialization
class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}



public class SingletonEx {
    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println("SingletonEager" + instance1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println("Singleton" + instance2);

        SingletonSynchronizedMethod instance3 = SingletonSynchronizedMethod.getInstance();
        System.out.println("SingletonSynchronizedMethod" + instance3);

        SingletonSynchronized instance4 = SingletonSynchronized.getInstance();
        System.out.println("SingletonSynchronized" + instance4);
    }
}