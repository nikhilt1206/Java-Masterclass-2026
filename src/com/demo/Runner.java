package com.demo;

public class Runner {
    public static void main(String[] args){
        //To call parameterized constructor we have to pass the parameters while calling
        Person p1 = new Person("Nikhil",20);
        //we don't have any constructor in our Person class - so java will create one constructor (dummy)
        //Default constructor will be called if no other constructor is present
        p1.setId(41);
        p1.setName("Rola");
    }
}
