package com.exception.handling;

public class PersonRunner {
    public static void main(String[] args){
        //We have to initialize local variable explicitly
        Person p = null; //reference variable p which stores the hashcode of the object created in Heap memory
        try{
            System.out.println(p.getName());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
