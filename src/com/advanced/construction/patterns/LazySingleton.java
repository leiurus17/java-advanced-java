package com.advanced.construction.patterns;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Lazy Singleton.");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

}
