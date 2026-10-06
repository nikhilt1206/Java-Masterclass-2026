package com.inheritance;
//child class
public class B extends A{ //To show the inheritance (relationship), we use extends keyword
    //If the parent class has parameterized constructor, then it's job of child class to call parent class constructor
    public B(int x, int y) {
        //Constructor chaining - child class constructor calling parent class constructor explicitly - super keyword
        super(x, y); //super signifies the immediate parent of the child class
        //whatever values we want to give to the B class constructor will be given to the A class constrcutor
    }

    public void add(){
        System.out.println(x+y);
    }
}
