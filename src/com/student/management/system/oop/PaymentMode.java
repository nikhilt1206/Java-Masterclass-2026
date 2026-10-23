package com.student.management.system.oop;

public enum PaymentMode {
    //enum is user defined data type (class, interface) which is meant to handle constants
    //enum don't have variables they have values which are going to be "public static final" - immutable
    //constant values - CASH, UOI, and CARD
    //Helps to make code better at type checking so that only valid values can passed
    CASH, UPI, CARD
}
