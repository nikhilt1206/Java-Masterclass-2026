package com.exception.handling;

public class PersonRunner1 {
    public static void main(String[] args){
        Person p1=null;
        Person p2=null;
        try {
             p1 = new Person(null, 25); //this line will create the exception so next line will not be executed
             p2 = new Person("Raj", -25);
        }
        catch (InvalidNameException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(p1);
        System.out.println(p1);
    }
}
