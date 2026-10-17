package com.staticexample;

public class Emp {

    private String name;
    public static String companyName;
    //To do first time initialization of a static variable we have to use static block
    //SB only executed once (even before the constructor) - first thing to be executed
    //The order in which the static blocks are kept in program will be executed by Java
    static {
        //initialize static variables - Early initialization of static variables
        companyName = "Infosys";
        System.out.println("Hi, I am in the static block");
        //resources that needs to be initialized during the class loading time
        //example : reading properties file for config/env, DB connectivity, set up Logger in AF
        //Advantage : Early initialization
        //If anything goes wrong, even our test execution starts we can capture the issues
    }

    static {
        System.out.println("Static block 2");
    }

    static {
        System.out.println("Static block 3");
    }

    public Emp(String name) {
        this.name = name;
        companyName="Mphasis";
        System.out.println("Hi, I am inside the constructor");
    }
}
