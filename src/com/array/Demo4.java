package com.array;

public class Demo4 {
    public static void main(String[] args){
        int marks[] = null; //only reference variable is declared, no array is created in heap memory
        //marks is having default value - null
        //null - nothing/no array creation
        //Reference variable - int marks[] - default value - null
        //null keyword is only used with non-primitive data types (Arrays,Classes,String,Interfaces) - not used with PDT

        System.out.println(marks);
    }
}
