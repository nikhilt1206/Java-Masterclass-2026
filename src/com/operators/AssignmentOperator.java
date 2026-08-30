package com.operators;

public class AssignmentOperator {
    public static void main(String[] args){
        int a = 10; //'=' is an assignment operator
        int b = 20;

        a+= b; //a = a + b;
        System.out.println(a);
        a-= b; //a = a - b;
        System.out.println(a);
        a*= b; //a = a * b;
        System.out.println(a);
        a/= b; //a = a / b;
        System.out.println(a);
        a%= b; //a = a % b;
        System.out.println(a);
    }
}
