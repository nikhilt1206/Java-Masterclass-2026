package com.exception.handling;

public class Example3 {
    public static void main(String[] args){
        //Java 7+ - we can combine multiple exceptions and put into a single catch block
        try{
            int result = 10/0; //this line triggered the exception so execution will not go to next line
            int[] a = new int[2];
            System.out.println(a[4]);//this line will also cause exception
            Person p = null;
            System.out.println(p.getName()); //this line will also cause exception
        }
        catch(ArithmeticException | NullPointerException  | ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
