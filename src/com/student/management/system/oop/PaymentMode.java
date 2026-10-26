package com.student.management.system.oop;

public enum PaymentMode implements EnumDemo{
    //Enumeration - Introduced in Java 5
    //Special class in which we can store constant values - should be public static final
    //enum can have constant value, private constructor, instance variable and public methods
    //enum are basically used for type checking (invalid values can be checked or avoided during compile time)
    //parent class of enum stored in package - java.lang.enum
    //enum is user defined data type (class, interface) which is meant to handle constants
    //enum don't have variables they have values which are going to be "public static final" - immutable
    //enums internally uses singleton pattern - only one object will be created - memory efficient
    //enums cannot extend classes, but it can implement Interfaces
    //constant values - CASH, UOI, and CARD
    //Helps to make code better at type checking so that only valid values can passed
    CASH("Payment via Cash") {
        @Override
        public void test() {
            System.out.println("Test method from Cash");
        }
    },
    UPI("Payment via Google Pay") {
        @Override
        public void test() {
            System.out.println("Test method from Google Pay");
        }
    },
    CARD("Payment via Credit Card") {
        @Override
        public void test() {
            System.out.println("Test method from Credit Card");
        }
    }; //predefined set of values
    //the description inside " " has to be set by the constructor

    private String description;

    private PaymentMode(String desciption){
        this.description = desciption;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void demo() {
        System.out.println("From the payment mode demo method");
    }

    //enums can have abstract methods
    public abstract void test();
}
