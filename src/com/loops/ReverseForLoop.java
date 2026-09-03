package com.loops;

public class ReverseForLoop {
    public static void main(String[] args){
        //Reverse for loop
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        //infinite loop - in case no condition is given
        //for(int i = 5; ; i--){
           // System.out.println(i);
        //}

        //Multiple initializations
        for(int i = 5, j = 1; i >= 1; i--,j++){
            System.out.println(i + " " + j);
        }

        //no initializations inside for loop
        int i = 5, j = 1; //local variables in the main method
        for(; i >= 1; i--,j++){
            System.out.println(i + " " + j);
        }
    }
}
