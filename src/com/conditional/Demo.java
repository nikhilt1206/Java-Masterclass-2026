package com.conditional;

public class Demo {
    public static void main(String[] args){
        //Conditional Statement
        //If Statement
        System.out.println("Hi");
        int c; //declaration - Memory allocation
        c = 10+5; //c will store 15
        if((c > 10) && (c==15)){
            System.out.println("c is greater than 10");
            System.out.println("Hello");
        }
        int a = 15;
        if(a > 20){ //Since a < 20 - condition becomes false so it won't print next statements
            System.out.println("a is greater than 20");
            System.out.println("Hi");
        }
    }
}
