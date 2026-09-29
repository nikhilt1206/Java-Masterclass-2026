package com.demo;

public class Emp {
    private String name;

    //Private constructor - if you want to create a singleton class - object cannot be created outside the class
    //When our constructor is public, we are giving the flexibility to create the object outside the class
    //Also, we can create the object inside the class
    //Private constructors are used in Singleton Design Pattern
    private Emp(String name){
        this.name=name;
    }

    //If we want to access method outside the class without making object - we can make it static
    //static methods can be accessed outside the class provided they are declared as public
    public static Emp createEmpAccount(String name){
        Emp e1 = new Emp(name);
        return e1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
