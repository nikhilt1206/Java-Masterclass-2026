package com.loops;

public class SimpleWhileLoop {
    public static void main(String[] args){
        int number = 1; //local variable inside main method - Initialization
        while(number <= 5){ //Condition check
            System.out.println(number);
            number = number + 1; //Updation
        }
    }
}
