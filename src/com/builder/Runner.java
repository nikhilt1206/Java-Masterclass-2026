package com.builder;

public class Runner {
    public static void main(String[] args){
        //if constructor is private then we cannot create object outside the class - but can be created within the class
        //Emp e1 = new Emp("Nikhil",101,1500);
        //System.out.println(e1);

        //using builder design pattern order is not important
        Emp e2 = new Emp.Builder().name("Roli").salary(89000).empId(141).build();
        System.out.println(e2);
    }
}
