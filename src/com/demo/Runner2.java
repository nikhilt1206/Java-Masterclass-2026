package com.demo;

public class Runner2 {
    public static void main(String[] args){
        //Emp emp = new Emp("Raj");
        //if the Emp() constructor is private then above line will give error - constructor not visible
        //Using static method we are initializing name
        Emp e1 = Emp.createEmpAccount("Nikhil");
        System.out.println(e1.getName());
    }
}
