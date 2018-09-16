package com.advanced.construction;

public class InitializationBlock {
    {
        // This is the initialization block
        System.out.println("I am from the initialization block.");
    }

    {
        // You can create many initialization blocks
        System.out.println("I am an another initialization block.");
    }
}
