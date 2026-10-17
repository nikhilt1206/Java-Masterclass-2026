package com.staticexample;

public class Runner {
    public static void main(String[] args){
        System.out.println(Emp.companyName);
        Emp e = new Emp("Nikhil");
        System.out.println(Emp.companyName);
        Emp e1 = new Emp("Nikhil");
        Emp e2= new Emp("Roli");
        Emp e3 = new Emp("Apsara");
    }
}