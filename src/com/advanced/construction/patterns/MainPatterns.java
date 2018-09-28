package com.advanced.construction.patterns;

public class MainPatterns {

    public static void main(String[] args) {

        // Cannot be able to instantiate
        // NaiveSingleton naiveSingleton = new NaiveSingleton();

        NaiveSingleton.getInstance();

        // Only one "I can only be called in singleton." will appear
        // even though we called NaiveSingleton.getInstance(); multiple times.
        NaiveSingleton.getInstance();

        EagerSingleton.getInstance();
        EagerSingleton.getInstance();

        LazySingleton.getInstance();
        LazySingleton.getInstance();

    }
}
