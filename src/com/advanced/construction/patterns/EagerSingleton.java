package com.advanced.construction.patterns;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Eager Singleton.");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
