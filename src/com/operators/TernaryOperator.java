package com.operators;

public class TernaryOperator {
    public static void main(String[] args){
        //Ternary operator - shorthand if-else statement (conditional statement)
        //Expression - (Condition) ? expression1 : expression2 - if Condition is true - expression1 gets executed otherwise expression2
        //One liner if-else statement

        int a = 100;
        int b = 120;
        int max = (a>b) ? a : b; //max = b - since b is greater than a so 120 gets assigned to max variable
        System.out.println(max);

        //Number is even or odd
        int number = 25;
        boolean isEven = (number % 2 == 0) ? true : false; //since (25 % 2)!= 0 so it will print false
        System.out.println(isEven);
    }
}
