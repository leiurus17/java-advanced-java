package com.advanced.construction;

public class ConstructorsTest {

    public static void main(String[] args) {
        ConstructorWithArguments constructorWithArguments = new ConstructorWithArguments("arg1", "arg2");
        NoArgConstructor noArgConstructor = new NoArgConstructor();
        NoConstructor noConstructor = new NoConstructor();
        InitializationBlock initializationBlock = new InitializationBlock();
    }
}
