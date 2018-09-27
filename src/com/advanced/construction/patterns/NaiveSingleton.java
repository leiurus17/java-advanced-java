package com.advanced.construction.patterns;

public class NaiveSingleton {

    private static NaiveSingleton instance;

    private NaiveSingleton() {
        System.out.println("I can only be called in singleton and only once.");
    }

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            instance = new NaiveSingleton();
        }

        return instance;
    }
}
