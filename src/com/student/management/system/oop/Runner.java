package com.student.management.system.oop;

//This is the class which has to be executed
public class Runner {
    public static void main(String[] args){
        int x = 10; //int is data type, x is variable and 10 is value (primitive data type)
        int y[] = new int[3]; //int is PDT, y is reference variable and new int[3] - array
        Student s1; //Student - user defined data type (non-primitive) and s1 is reference variable (not object)
        //s1 - stores the hashcode of the object and is created inside Stack
        s1 = new Student(); //new Student() - is object and s1 is reference variable - object creation
        /*Whenever we are going to create an object - 3 things will happen:
        1. Class will be loaded into memory (Student Class)
        2. Instance variables are created (heap memory)
        3. Constructor is called
        */
        Student s2 = new Student(); //another object will be created in the heap memory & instance variables created again in the Heap memory
        //Two objects we created - 2 students (14 instance variables are created)
        //Each object is indicating the real student present in the class.
    }
}
