package com.array;

public class Demo3 {
    public static void main(String[] args){
        int marks[] = new int[3];
        marks[0]=8;
        marks[1]=7;
        marks[2]=6;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //if we try to access the part/value/index of the array which is not present
        System.out.println(marks[3]); //there is no such index present - not part of the array
        //even though we won't get any compilation error, after running/executing will get an exception
        //Exception - ArrayIndexOutOfBoundsException (it is Runtime Exception) - while running we will get this exception
        //Exceptions are statement which produce undesired result
    }
}
