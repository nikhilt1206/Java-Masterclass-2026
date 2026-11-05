package com.exception.handling;

public class Example8CustomException {
    public static void main(String[] args){
        Person p1=null;
        Person p2=null;
        try{
             p1 = new Person(null,20);
             p2 = new Person("Raj",124);
        }
        catch(InvalidNameException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
