package com.advanced.construction;

public class StaticInitializationBlock {

    static {
        // static initialization here
        System.out.println("I am static.");
    }

    static {
        // static initialization again
        System.out.println("Hi again.");
    }
}
