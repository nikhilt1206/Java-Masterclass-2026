package com.exception.handling;

public class Example5 {
    public static void main(String[] args){
        //Can we have try block without catch? - Yes but there should be finally block
        try{
            int result = 10/10;
            int[] a = new int[2];
            System.out.println(a[4]);
            Person p = null;
            System.out.println(p.getName());
        }
        //try cannot exist on its own - either we should have a catch or should have a finally
        finally {

        }
    }
}
