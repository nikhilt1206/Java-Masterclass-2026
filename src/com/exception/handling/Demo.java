package com.exception.handling;

public class Demo {
    public static void main(String[] args){
        int []a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        //a[3] = 40; this will create a problem - exception but java will treat it as valid
        //there are only 3 memory location, we are trying to access the location which does not exist - exception
        //we are trying to go beyond reach of the array
        //This exception will come at runtime, when memory location will start.
        //Exception - ArrayIndexOutOfBoundsException
        try{
            a[3]=4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        for( int i : a){
            System.out.println(i);
        }
    }
}
