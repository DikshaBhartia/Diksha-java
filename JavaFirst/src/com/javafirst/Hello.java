package com.javafirst;

public class Hello {
    public void nonstaticTest(){
        System.out.println("Non-Static Test");
    }
    public static void staticTest(){
        System.out.println("Static Test");
    }
    public static void main(String[] args) {
        Hello helloObject = new Hello();
        System.out.println("Hello World");
        helloObject.nonstaticTest();
        staticTest();
    }
}
