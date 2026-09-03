package com.loops;

public class BreakStatement {
    public static void main(String[] args){
        int i = 1; //local variable
        while(true){
            if(i == 5){
                break;
            }
            else{
                System.out.println("Hello there!!");
                i++;
            }
        }
    }
}
