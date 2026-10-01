package com.student.management.system.oop;

public class Runner4 {
    public static void main(String[] args){

        //Object creation happen for once - constructor will be called once
        Student s1 = new Student("Uday",12,22,80,70,89);
        //if we hide new - Student() - looks like a method call
        //Constructor is a special entity (method) inside a class which has same name as class
        //Job of constructor is to do assignment where as job of setter is to do updation
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());

        //Here, first time roll number got initialized to 22 then after setter has updated it to 33
        s1.setName("Uday P");
        s1.setRollNumber(33);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
    }
}
