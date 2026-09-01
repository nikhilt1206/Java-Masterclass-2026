package com.operators;

public class InstanceOfOperator {
    public static void main(String[] args){
        //instanceOf - tells if an object belongs to a certain class or not
        String name = "Nikhil";
        //check name(object) belongs to String(class) or not?
        if(name instanceof String){
            System.out.println("Yes");
        }
        //Suppose we use a different class
        StringBuilder name1 = new StringBuilder("Tiwari");
        //name is not instance of StringBuilder class - it is instance of String class
        //if(name1 instanceof String){
        //    System.out.println("Yes");
        //}
        //Object is parent of all the classes so this will work
        if(name1 instanceof Object){
            System.out.println("Yes");
        }
        //It does not work with Primitive Data Types
        int number = 10;
        Integer number1 = 10; //This will work
        //if(number instanceof Integer){ //int is data type & Integer is a class
        //    System.out.println("Yes");
        //}
    }
}
