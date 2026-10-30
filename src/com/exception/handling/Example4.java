package com.exception.handling;

public class Example4 {
    public static void main(String[] args){
        //try-catch-finally
        //finally block will be executed even if code is working correct or not or if we get an exception
        //finally block will be executed even if all the statement in the try block was executed or not
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
        //In finally block we used to release the resources which we have occupied
        //we try to close the resources which we opened/connected in the finally block
        finally {
            System.out.println("Hello i am in the finally block");
        }
    }
}
