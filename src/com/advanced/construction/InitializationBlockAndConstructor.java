package com.advanced.construction;

public class InitializationBlockAndConstructor {
    {
        // Initialization blocks are always called before any Constructors
        System.out.println("I am shown first.");
    }

    public InitializationBlockAndConstructor() {
        System.out.println("I am shown after.");
    }
}
