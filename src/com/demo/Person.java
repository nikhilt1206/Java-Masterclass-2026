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
