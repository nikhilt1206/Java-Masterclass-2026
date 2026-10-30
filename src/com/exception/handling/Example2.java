package com.exception.handling;

public class Example2 {
    public static void main(String[] args){
        //Simple try catch block
        //once an exception occurs in the try block, it will leave the try block and go to respective catch block
        try{
            int result = 10/0; //this line triggered the exception so execution will not go to next line
            int[] a = new int[2];
            System.out.println(a[4]);//this line will also cause exception
            Person p = null;
            System.out.println(p.getName()); //this line will also cause exception
        }
        catch(ArithmeticException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        //if we have multiple codes which will going to give multiple kind of exceptions - we can use try with multiple catch
        catch (NullPointerException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
