package com.demo;

public class Person {
    //instance variable - created inside Heap
    private String name;
    private int id;

    //Default Constructor - constructor which don't have any parameters - so java will call this if no other constructor is present
    Person(){ //here we have 0 parameters
        System.out.println("Default Constructor for Person class");
    }

    //Parameterized Constructor - has parameters
    public Person(String name, int id) { //here we have 2 parameters
        System.out.println("Parametrized Constructor for Person class");
        this.name = name;
        this.id = id;
    }

    //Copy Constructor - Used to create a copy of an Object
    //Whatever will be the value of those instance variables, they will be used as a reference to initialize the newly created object
    public Person(Person other){
        //it will take the value of another object of same class
        System.out.println("Copy Constructor");
        this.name = other.name;
        this.id = other.id;
    }

    //Same method name but different parameters - Constructor Overloading
    //Differentiated using parameters which are present in the method



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
